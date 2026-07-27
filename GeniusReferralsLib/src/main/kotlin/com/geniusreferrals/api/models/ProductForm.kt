package com.geniusreferrals.api.models

data class ProductForm(
    val name: String,
    val description: String? = null,
    val variants: List<VariantForm>? = null
)