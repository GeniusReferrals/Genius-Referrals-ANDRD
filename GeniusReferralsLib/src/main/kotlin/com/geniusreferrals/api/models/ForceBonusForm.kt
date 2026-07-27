package com.geniusreferrals.api.models

data class ForceBonusForm(
    val advocateToken: String,
    val bonusType: String,
    val amount: Double,
    val currencyCode: String,
    val paymentMethodId: String? = null
)