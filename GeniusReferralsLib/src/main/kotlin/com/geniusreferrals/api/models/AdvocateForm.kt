package com.geniusreferrals.api.models

data class AdvocateForm(
    val firstname: String,
    val lastname: String,
    val email: String,
    val currencyCode: String? = null,
    val phoneNumber: String? = null,
    val customFields: Map<String, String>? = null
)