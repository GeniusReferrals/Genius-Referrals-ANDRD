package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.VoucherForm
import com.geniusreferrals.api.models.VoucherPatchForm

class VouchersController(private val client: GRClient) {

    fun getVouchers(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/vouchers", mapOf("page" to page, "limit" to limit))

    fun getVoucher(accountSlug: String, voucherId: String): String =
        client.get("/accounts/$accountSlug/vouchers/$voucherId")

    fun createVoucher(accountSlug: String, form: VoucherForm): String =
        client.post("/accounts/$accountSlug/vouchers", Json.toJsonWithWrapper("voucher", form))

    fun patchVoucher(accountSlug: String, voucherId: String, form: VoucherPatchForm): String =
        client.patch("/accounts/$accountSlug/vouchers/$voucherId", Json.toJson(form))

    fun deleteVoucher(accountSlug: String, voucherId: String): String =
        client.delete("/accounts/$accountSlug/vouchers/$voucherId")

    fun getVoucherDenominations(accountSlug: String, voucherId: String): String =
        client.get("/accounts/$accountSlug/vouchers/$voucherId/denominations")
}