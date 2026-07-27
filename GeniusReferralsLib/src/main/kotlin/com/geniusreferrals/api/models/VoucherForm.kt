package com.geniusreferrals.api.models

data class VoucherForm(
    val code: String,
    val value: Double,
    val currencyCode: String,
    val status: String? = null,
    val advocateToken: String? = null
)