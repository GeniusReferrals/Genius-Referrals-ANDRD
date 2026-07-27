package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient

class CampaignsController(private val client: GRClient) {

    fun getCampaigns(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/campaigns", mapOf("page" to page, "limit" to limit))

    fun getCampaign(accountSlug: String, campaignSlug: String): String =
        client.get("/accounts/$accountSlug/campaigns/$campaignSlug")
}