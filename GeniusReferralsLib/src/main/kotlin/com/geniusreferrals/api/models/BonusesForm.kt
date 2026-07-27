package com.geniusreferrals.api.models

data class BonusesForm(
    val advocateToken: String,
    val bonusType: String,
    val amount: Double,
    val currencyCode: String,
    val paymentMethodId: String? = null
)