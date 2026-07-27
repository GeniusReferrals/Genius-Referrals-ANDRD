package com.geniusreferrals.api.models

data class RedemptionRequest(
    val id: String? = null,
    val advocateToken: String? = null,
    val amount: Double? = null,
    val currencyCode: String? = null,
    val status: String? = null,
    val requestActionSlug: String? = null,
    val internalNote: String? = null,
    val modifiedBy: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)