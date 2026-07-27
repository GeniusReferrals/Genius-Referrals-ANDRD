package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.ReferralForm

class ReferralsController(private val client: GRClient) {

    fun getReferrals(accountSlug: String, advocateToken: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken/referrals", mapOf("page" to page, "limit" to limit))

    fun getReferral(accountSlug: String, advocateToken: String, referralId: String): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken/referrals/$referralId")

    fun postReferral(accountSlug: String, advocateToken: String, form: ReferralForm): String =
        client.post("/accounts/$accountSlug/advocates/$advocateToken/referrals",
            Json.toJsonWithWrapper("referral", form))

    fun putReferral(accountSlug: String, advocateToken: String, referralId: String, form: ReferralForm): String =
        client.put("/accounts/$accountSlug/advocates/$advocateToken/referrals/$referralId",
            Json.toJsonWithWrapper("referral", form))

    fun deleteReferral(accountSlug: String, advocateToken: String, referralId: String): String =
        client.delete("/accounts/$accountSlug/advocates/$advocateToken/referrals/$referralId")
}