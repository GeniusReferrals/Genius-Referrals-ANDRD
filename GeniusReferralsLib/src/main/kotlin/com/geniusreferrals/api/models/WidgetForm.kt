package com.geniusreferrals.api.models

data class WidgetForm(
    val type: String,
    val name: String? = null,
    val slug: String? = null,
    val active: Boolean? = null,
    val widgetTranslations: List<WidgetTranslationForm>? = null
)