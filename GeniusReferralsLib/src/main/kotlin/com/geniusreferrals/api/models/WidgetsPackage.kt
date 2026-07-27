package com.geniusreferrals.api.models

data class WidgetsPackage(
    val slug: String? = null,
    val name: String? = null,
    val widgets: List<Widget>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)