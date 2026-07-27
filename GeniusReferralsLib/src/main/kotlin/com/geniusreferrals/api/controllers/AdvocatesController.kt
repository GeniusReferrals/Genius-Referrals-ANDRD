package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.AdvocateForm
import com.geniusreferrals.api.models.AdvocatePatchForm
import com.geniusreferrals.api.models.PaymentMethodForm

class AdvocatesController(private val client: GRClient) {

    fun getAdvocates(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/advocates", mapOf("page" to page, "limit" to limit))

    fun getAdvocate(accountSlug: String, advocateToken: String): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken")

    fun postAdvocate(accountSlug: String, form: AdvocateForm): String =
        client.post("/accounts/$accountSlug/advocates", Json.toJsonWithWrapper("advocate", form))

    fun putAdvocate(accountSlug: String, advocateToken: String, form: AdvocateForm): String =
        client.put("/accounts/$accountSlug/advocates/$advocateToken", Json.toJsonWithWrapper("advocate", form))

    fun patchAdvocate(accountSlug: String, advocateToken: String, form: AdvocatePatchForm): String =
        client.patch("/accounts/$accountSlug/advocates/$advocateToken", Json.toJson(form))

    fun deleteAdvocate(accountSlug: String, advocateToken: String): String =
        client.delete("/accounts/$accountSlug/advocates/$advocateToken")

    fun deleteAdvocates(accountSlug: String, advocates: String): String =
        client.delete("/accounts/$accountSlug/advocates", mapOf("advocates" to advocates))

    fun getAdvocateShareLinks(accountSlug: String, advocateToken: String): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken/share-links")

    fun getAdvocatePaymentMethods(accountSlug: String, advocateToken: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken/payment-methods", mapOf("page" to page, "limit" to limit))

    fun getAdvocatePaymentMethod(accountSlug: String, advocateToken: String, paymentMethodId: String): String =
        client.get("/accounts/$accountSlug/advocates/$advocateToken/payment-methods/$paymentMethodId")

    fun postAdvocatePaymentMethod(accountSlug: String, advocateToken: String, form: PaymentMethodForm): String =
        client.post("/accounts/$accountSlug/advocates/$advocateToken/payment-methods",
            Json.toJsonWithWrapper("advocate_payment_method", form))

    fun putAdvocatePaymentMethod(accountSlug: String, advocateToken: String, paymentMethodId: String, form: PaymentMethodForm): String =
        client.put("/accounts/$accountSlug/advocates/$advocateToken/payment-methods/$paymentMethodId",
            Json.toJsonWithWrapper("advocate_payment_method", form))
}