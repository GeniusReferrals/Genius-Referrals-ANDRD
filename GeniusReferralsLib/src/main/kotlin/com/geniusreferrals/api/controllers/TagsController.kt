package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.TagForm

class TagsController(private val client: GRClient) {

    fun getTags(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/tags", mapOf("page" to page, "limit" to limit))

    fun getTag(accountSlug: String, tagSlug: String): String =
        client.get("/accounts/$accountSlug/tags/$tagSlug")

    fun createTag(accountSlug: String, form: TagForm): String =
        client.post("/accounts/$accountSlug/tags", Json.toJsonWithWrapper("tag", form))

    fun updateTag(accountSlug: String, tagSlug: String, form: TagForm): String =
        client.put("/accounts/$accountSlug/tags/$tagSlug", Json.toJsonWithWrapper("tag", form))

    fun deleteTag(accountSlug: String, tagSlug: String): String =
        client.delete("/accounts/$accountSlug/tags/$tagSlug")
}