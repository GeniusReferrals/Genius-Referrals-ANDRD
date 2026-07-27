package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient

class AuthenticationsController(private val client: GRClient) {
    fun getAuthentication(): String = client.get("/test-authentication")
}