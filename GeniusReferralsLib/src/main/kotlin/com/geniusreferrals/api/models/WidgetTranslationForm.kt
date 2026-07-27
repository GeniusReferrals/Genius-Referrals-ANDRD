package com.geniusreferrals.api.models

data class WidgetTranslationForm(
    val locale: String,
    val title: String? = null,
    val description: String? = null
)