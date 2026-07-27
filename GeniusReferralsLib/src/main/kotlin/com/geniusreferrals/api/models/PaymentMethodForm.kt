package com.geniusreferrals.api.models

data class PaymentMethodForm(
    val type: String,
    val status: String? = null,
    val data: Map<String, String>? = null
)