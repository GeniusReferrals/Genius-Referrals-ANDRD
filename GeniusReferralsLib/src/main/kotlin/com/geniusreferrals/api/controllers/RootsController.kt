package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient

class RootsController(private val client: GRClient) {
    fun getRoot(): String = client.get("/")
}