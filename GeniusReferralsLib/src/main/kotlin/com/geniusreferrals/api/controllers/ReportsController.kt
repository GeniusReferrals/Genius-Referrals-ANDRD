package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient

class ReportsController(private val client: GRClient) {

    fun getBonusesDailyGiven(accountSlug: String, startDate: String, endDate: String): String =
        client.get("/accounts/$accountSlug/reports/bonuses-daily-given",
            mapOf("start_date" to startDate, "end_date" to endDate))

    fun getClickDailyParticipation(accountSlug: String, startDate: String, endDate: String): String =
        client.get("/accounts/$accountSlug/reports/click-daily-participation",
            mapOf("start_date" to startDate, "end_date" to endDate))

    fun getShareDailyParticipation(accountSlug: String, startDate: String, endDate: String): String =
        client.get("/accounts/$accountSlug/reports/share-daily-participation",
            mapOf("start_date" to startDate, "end_date" to endDate))

    fun get1099TaxReport(accountSlug: String, year: Int): String =
        client.get("/accounts/$accountSlug/reports/1099-tax-report", mapOf("year" to year))

    fun getRevenue(accountSlug: String, startDate: String, endDate: String): String =
        client.get("/accounts/$accountSlug/reports/revenue",
            mapOf("start_date" to startDate, "end_date" to endDate))
}