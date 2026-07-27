package com.geniusreferrals.api.models

data class PaymentMethod(
    val id: String? = null,
    val advocateToken: String? = null,
    val type: String? = null,
    val status: String? = null,
    val data: Map<String, String>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)