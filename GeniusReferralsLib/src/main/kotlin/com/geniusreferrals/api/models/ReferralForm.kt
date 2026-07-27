package com.geniusreferrals.api.models

data class ReferralForm(
    val url: String,
    val referralMedium: String? = null,
    val referralSource: String? = null,
    val campaignSlug: String? = null
)