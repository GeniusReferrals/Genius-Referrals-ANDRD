package com.geniusreferrals.api

data class Configuration(
    var authToken: String,
    var baseUrl: String = "https://api.geniusreferrals.com",
    var contentType: String = "application/json",
    var timeoutMs: Long = 30_000
)