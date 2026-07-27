package com.geniusreferrals.api.models

data class AdvocatePatchForm(
    val firstname: String? = null,
    val lastname: String? = null,
    val email: String? = null,
    val currencyCode: String? = null,
    val phoneNumber: String? = null,
    val customFields: Map<String, String>? = null
)