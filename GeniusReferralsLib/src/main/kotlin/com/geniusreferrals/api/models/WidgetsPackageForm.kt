package com.geniusreferrals.api.models

data class WidgetsPackageForm(
    val name: String,
    val widgets: List<WidgetForm>? = null
)