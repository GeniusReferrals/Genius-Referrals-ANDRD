package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.ProcessRedemptionForm
import com.geniusreferrals.api.models.RedemptionRequestForm
import com.geniusreferrals.api.models.RedemptionRequestPatchForm

class RedemptionRequestsController(private val client: GRClient) {

    fun getRedemptionRequests(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/redemption-requests", mapOf("page" to page, "limit" to limit))

    fun getRedemptionRequest(accountSlug: String, requestId: String): String =
        client.get("/accounts/$accountSlug/redemption-requests/$requestId")

    fun postRedemptionRequest(accountSlug: String, form: RedemptionRequestForm): String =
        client.post("/accounts/$accountSlug/redemption-requests",
            Json.toJsonWithWrapper("redemption_request", form))

    fun patchRedemptionRequest(accountSlug: String, requestId: String, form: RedemptionRequestPatchForm): String =
        client.patch("/accounts/$accountSlug/redemption-requests/$requestId", Json.toJson(form))

    fun patchRedemption(accountSlug: String, requestId: String, form: ProcessRedemptionForm): String =
        client.patch("/accounts/$accountSlug/redemption-requests/$requestId/redemption", Json.toJson(form))
}