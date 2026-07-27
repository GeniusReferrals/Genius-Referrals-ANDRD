package com.geniusreferrals.api

import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.concurrent.TimeUnit

class GRClient(private val config: Configuration) {

    private val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(config.timeoutMs, TimeUnit.MILLISECONDS)
        .readTimeout(config.timeoutMs, TimeUnit.MILLISECONDS)
        .build()

    private val jsonMedia = "${config.contentType}; charset=utf-8".toMediaType()

    private fun requestBuilder(path: String): Request.Builder {
        val url = if (path.startsWith("http")) path else "${config.baseUrl.trimEnd('/')}$path"
        return Request.Builder()
            .url(url.trim())
            .header("X-Auth-Token", config.authToken)
            .header("Content-Type", config.contentType)
            .header("Accept", config.contentType)
    }

    private fun buildUrl(path: String, params: Map<String, Any?> = emptyMap()): String {
        val url = if (path.startsWith("http")) path else "${config.baseUrl.trimEnd('/')}$path"
        val filtered = params.filterValues { it != null }
        if (filtered.isEmpty()) return url
        val qs = filtered.entries.joinToString("&") { (k, v) ->
            "$k=${java.net.URLEncoder.encode(v.toString(), "UTF-8")}"
        }
        return "$url?$qs"
    }

    private fun execute(request: Request): String {
        client.newCall(request).execute().use { response ->
            val body = response.body?.string() ?: ""
            if (response.code == 401) throw ApiException("Not authenticated", 401)
            if (response.code == 403) throw ApiException("Not authorized", 403)
            if (response.code == 404) throw ApiException("Resource not found", 404)
            if (response.code !in 200..208) {
                throw ApiException("HTTP ${response.code}: $body", response.code)
            }
            return body
        }
    }

    fun get(path: String, params: Map<String, Any?> = emptyMap()): String {
        val url = buildUrl(path, params)
        return execute(requestBuilder(url).get().build())
    }

    fun post(path: String, body: String): String {
        val rb = body.toRequestBody(jsonMedia)
        return execute(requestBuilder(path).post(rb).build())
    }

    fun put(path: String, body: String): String {
        val rb = body.toRequestBody(jsonMedia)
        return execute(requestBuilder(path).put(rb).build())
    }

    fun patch(path: String, body: String): String {
        val rb = body.toRequestBody(jsonMedia)
        return execute(requestBuilder(path).patch(rb).build())
    }

    fun delete(path: String, params: Map<String, Any?> = emptyMap()): String {
        val url = buildUrl(path, params)
        return execute(requestBuilder(url).delete().build())
    }
}
