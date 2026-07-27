package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.AccountForm

class AccountsController(private val client: GRClient) {

    fun getAccounts(page: Int = 1, limit: Int = 10, format: String? = null, clientSlug: String? = null): String {
        val params = mutableMapOf<String, Any?>("page" to page, "limit" to limit)
        if (format != null) params["format"] = format
        if (clientSlug != null) params["client_slug"] = clientSlug
        return client.get("/accounts", params)
    }

    fun getAccount(accountSlug: String): String =
        client.get("/accounts/$accountSlug")

    fun createAccount(form: AccountForm): String =
        client.post("/accounts", Json.toJsonWithWrapper("account", form))

    fun updateAccount(accountSlug: String, form: AccountForm): String =
        client.put("/accounts/$accountSlug", Json.toJsonWithWrapper("account", form))

    fun deleteAccount(accountSlug: String): String =
        client.delete("/accounts/$accountSlug")
}