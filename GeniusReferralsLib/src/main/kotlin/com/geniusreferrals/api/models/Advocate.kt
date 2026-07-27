package com.geniusreferrals.api.models

data class Advocate(
    val token: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
    val email: String? = null,
    val currencyCode: String? = null,
    val phoneNumber: String? = null,
    val customFields: Map<String, String>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)