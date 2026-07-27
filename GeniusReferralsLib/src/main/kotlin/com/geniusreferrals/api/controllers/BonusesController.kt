package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.BonusPatchForm
import com.geniusreferrals.api.models.ForceBonusForm
import com.geniusreferrals.api.models.TagForm

class BonusesController(private val client: GRClient) {

    fun getBonuses(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/bonuses", mapOf("page" to page, "limit" to limit))

    fun getBonus(accountSlug: String, bonusId: String): String =
        client.get("/accounts/$accountSlug/bonuses/$bonusId")

    fun postBonus(accountSlug: String, form: ForceBonusForm): String =
        client.post("/accounts/$accountSlug/bonuses", Json.toJsonWithWrapper("bonus", form))

    fun forceBonus(accountSlug: String, form: ForceBonusForm): String =
        client.post("/accounts/$accountSlug/bonuses/force", Json.toJsonWithWrapper("bonus", form))

    fun deleteBonus(accountSlug: String, bonusId: String): String =
        client.delete("/accounts/$accountSlug/bonuses/$bonusId")

    fun patchBonus(accountSlug: String, bonusId: String, form: BonusPatchForm): String =
        client.patch("/accounts/$accountSlug/bonuses/$bonusId", Json.toJson(form))

    fun checkupBonuses(accountSlug: String): String =
        client.get("/accounts/$accountSlug/bonuses/checkup")

    fun getBonusTraces(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/bonuses/traces", mapOf("page" to page, "limit" to limit))

    fun getBonusTrace(accountSlug: String, traceId: String): String =
        client.get("/accounts/$accountSlug/bonuses/traces/$traceId")

    fun getBonusTags(accountSlug: String, bonusId: String): String =
        client.get("/accounts/$accountSlug/bonuses/$bonusId/tags")

    fun addBonusTag(accountSlug: String, bonusId: String, form: TagForm): String =
        client.post("/accounts/$accountSlug/bonuses/$bonusId/tags", Json.toJsonWithWrapper("tag", form))

    fun removeBonusTag(accountSlug: String, bonusId: String, tagSlug: String): String =
        client.delete("/accounts/$accountSlug/bonuses/$bonusId/tags/$tagSlug")
}