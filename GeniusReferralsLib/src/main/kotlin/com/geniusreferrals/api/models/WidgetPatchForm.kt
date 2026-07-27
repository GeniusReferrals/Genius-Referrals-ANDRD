package com.geniusreferrals.api.models

data class WidgetPatchForm(
    val type: String? = null,
    val name: String? = null,
    val slug: String? = null,
    val active: Boolean? = null
)