package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.WidgetForm
import com.geniusreferrals.api.models.WidgetPatchForm
import com.geniusreferrals.api.models.WidgetTranslationForm
import com.geniusreferrals.api.models.WidgetTranslationPatchForm
import com.geniusreferrals.api.models.WidgetsPackageForm

class WidgetsPackagesController(private val client: GRClient) {

    fun getWidgetsPackages(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/widgets-packages", mapOf("page" to page, "limit" to limit))

    fun getWidgetsPackage(accountSlug: String, packageSlug: String): String =
        client.get("/accounts/$accountSlug/widgets-packages/$packageSlug")

    fun createWidgetsPackage(accountSlug: String, form: WidgetsPackageForm): String =
        client.post("/accounts/$accountSlug/widgets-packages",
            Json.toJsonWithWrapper("widgets_package", form))

    fun updateWidgetsPackage(accountSlug: String, packageSlug: String, form: WidgetsPackageForm): String =
        client.put("/accounts/$accountSlug/widgets-packages/$packageSlug",
            Json.toJsonWithWrapper("widgets_package", form))

    fun deleteWidgetsPackage(accountSlug: String, packageSlug: String): String =
        client.delete("/accounts/$accountSlug/widgets-packages/$packageSlug")

    fun getWidgets(accountSlug: String, packageSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets",
            mapOf("page" to page, "limit" to limit))

    fun getWidget(accountSlug: String, packageSlug: String, widgetId: String): String =
        client.get("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId")

    fun createWidget(accountSlug: String, packageSlug: String, form: WidgetForm): String =
        client.post("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets",
            Json.toJsonWithWrapper("widget", form))

    fun patchWidget(accountSlug: String, packageSlug: String, widgetId: String, form: WidgetPatchForm): String =
        client.patch("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId",
            Json.toJson(form))

    fun putWidget(accountSlug: String, packageSlug: String, widgetId: String, form: WidgetForm): String =
        client.put("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId",
            Json.toJsonWithWrapper("widget", form))

    fun deleteWidget(accountSlug: String, packageSlug: String, widgetId: String): String =
        client.delete("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId")

    fun getWidgetTranslations(accountSlug: String, packageSlug: String, widgetId: String): String =
        client.get("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId/translations")

    fun getWidgetTranslation(accountSlug: String, packageSlug: String, widgetId: String, locale: String): String =
        client.get("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId/translations/$locale")

    fun createWidgetTranslation(accountSlug: String, packageSlug: String, widgetId: String, form: WidgetTranslationForm): String =
        client.post("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId/translations",
            Json.toJsonWithWrapper("widget_translation", form))

    fun patchWidgetTranslation(accountSlug: String, packageSlug: String, widgetId: String, locale: String,
                                form: WidgetTranslationPatchForm): String =
        client.patch("/accounts/$accountSlug/widgets-packages/$packageSlug/widgets/$widgetId/translations/$locale",
            Json.toJson(form))
}