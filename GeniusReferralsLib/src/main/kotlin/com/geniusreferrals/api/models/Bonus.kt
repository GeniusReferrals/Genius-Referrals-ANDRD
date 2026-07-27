package com.geniusreferrals.api.models

data class Bonus(
    val id: String? = null,
    val advocateToken: String? = null,
    val referralToken: String? = null,
    val referralAccountSlug: String? = null,
    val bonusType: String? = null,
    val amount: Double? = null,
    val currencyCode: String? = null,
    val status: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)