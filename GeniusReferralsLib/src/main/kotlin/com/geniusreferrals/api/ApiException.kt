package com.geniusreferrals.api

class ApiException(message: String, val statusCode: Int = 0) : Exception(message)