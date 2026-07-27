package com.geniusreferrals.api.models

data class Variant(
    val id: String? = null,
    val title: String? = null,
    val sku: String? = null,
    val prices: List<Price>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)