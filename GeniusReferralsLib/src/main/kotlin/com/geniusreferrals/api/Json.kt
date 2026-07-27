package com.geniusreferrals.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object Json {
    val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    inline fun <reified T> toJson(obj: T): String {
        val adapter = moshi.adapter(T::class.java)
        return adapter.toJson(obj)
    }

    inline fun <reified T> toJsonWithWrapper(wrapperKey: String, obj: T): String {
        val adapter = moshi.adapter(T::class.java)
        val jsonStr = adapter.toJson(obj)
        return "{\"$wrapperKey\":$jsonStr}"
    }

    inline fun <reified K, reified V> mapAdapter() =
        moshi.adapter(Map::class.java)
}