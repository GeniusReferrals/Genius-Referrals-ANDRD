package com.geniusreferrals.api.models

data class BonusForm(
    val advocateToken: String,
    val bonusType: String,
    val amount: Double,
    val currencyCode: String
)