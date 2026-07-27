package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient

class UtilitiesController(private val client: GRClient) {

    fun getBonusRedemptionMethods(page: Int = 1, limit: Int = 10): String =
        client.get("/bonus-redemption-methods", mapOf("page" to page, "limit" to limit))

    fun getBonusRedemptionMethod(slug: String): String =
        client.get("/bonus-redemption-methods/$slug")

    fun getCurrencies(page: Int = 1, limit: Int = 10): String =
        client.get("/currencies", mapOf("page" to page, "limit" to limit))

    fun getCurrency(code: String): String =
        client.get("/currencies/$code")

    fun getPaymentMethodsList(page: Int = 1, limit: Int = 10): String =
        client.get("/payment-methods", mapOf("page" to page, "limit" to limit))

    fun getRedemptionRequestActions(page: Int = 1, limit: Int = 10): String =
        client.get("/redemption-request-actions", mapOf("page" to page, "limit" to limit))

    fun getRedemptionRequestAction(slug: String): String =
        client.get("/redemption-request-actions/$slug")

    fun getRedemptionRequestStatuses(page: Int = 1, limit: Int = 10): String =
        client.get("/redemption-request-statuses", mapOf("page" to page, "limit" to limit))

    fun getRedemptionRequestStatus(slug: String): String =
        client.get("/redemption-request-statuses/$slug")

    fun getReferralOrigins(page: Int = 1, limit: Int = 10): String =
        client.get("/referral-origins", mapOf("page" to page, "limit" to limit))

    fun getReferralOrigin(slug: String): String =
        client.get("/referral-origins/$slug")
}