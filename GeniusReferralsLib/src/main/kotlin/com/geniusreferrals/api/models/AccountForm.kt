package com.geniusreferrals.api.models

data class AccountForm(
    val name: String,
    val domain: String? = null,
    val redirectUrl: String? = null,
    val disabled: Boolean? = null,
    val currencyCode: String? = null,
    val phoneNumber: String? = null
)