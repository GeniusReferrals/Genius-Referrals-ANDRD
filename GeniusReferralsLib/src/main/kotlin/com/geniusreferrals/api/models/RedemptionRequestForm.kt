package com.geniusreferrals.api.models

data class RedemptionRequestForm(
    val advocateToken: String,
    val amount: Double,
    val currencyCode: String,
    val paymentMethodId: String? = null
)