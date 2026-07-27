package com.geniusreferrals.api.models

data class VariantForm(
    val title: String,
    val sku: String? = null,
    val prices: List<PriceForm>? = null
)