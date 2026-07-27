package com.geniusreferrals.api.models

data class Widget(
    val id: String? = null,
    val type: String? = null,
    val name: String? = null,
    val slug: String? = null,
    val active: Boolean? = null,
    val widgetTranslations: List<WidgetTranslation>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)