package com.geniusreferrals.api.models

data class Account(
    val slug: String? = null,
    val name: String? = null,
    val domain: String? = null,
    val redirectUrl: String? = null,
    val disabled: Boolean? = null,
    val currencyCode: String? = null,
    val phoneNumber: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)