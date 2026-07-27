package com.geniusreferrals.api.models

data class Product(
    val slug: String? = null,
    val name: String? = null,
    val description: String? = null,
    val variants: List<Variant>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)