package com.geniusreferrals.api.models

data class Voucher(
    val id: String? = null,
    val code: String? = null,
    val value: Double? = null,
    val currencyCode: String? = null,
    val status: String? = null,
    val advocateToken: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)