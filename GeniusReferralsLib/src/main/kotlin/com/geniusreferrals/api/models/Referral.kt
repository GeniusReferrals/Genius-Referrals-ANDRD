package com.geniusreferrals.api.models

data class Referral(
    val id: String? = null,
    val advocateToken: String? = null,
    val referralShortUrl: String? = null,
    val referralMedium: String? = null,
    val referralSource: String? = null,
    val campaignSlug: String? = null,
    val url: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)