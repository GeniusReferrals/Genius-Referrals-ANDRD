package com.geniusreferrals.api.models

data class PriceForm(
    val amount: Double,
    val currencyCode: String? = null
)