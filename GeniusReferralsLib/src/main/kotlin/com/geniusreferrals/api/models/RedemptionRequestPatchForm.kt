package com.geniusreferrals.api.models

data class RedemptionRequestPatchForm(
    val status: String? = null,
    val requestActionSlug: String? = null,
    val internalNote: String? = null,
    val modifiedBy: String? = null
)