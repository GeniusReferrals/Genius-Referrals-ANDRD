package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GeniusReferralsClient
import com.geniusreferrals.api.models.*
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import com.geniusreferrals.api.ApiException
import java.util.concurrent.TimeUnit

class ControllersTest {

    private lateinit var server: MockWebServer
    private lateinit var sdk: GeniusReferralsClient
    private var recordedRequest: RecordedRequest? = null

    @BeforeEach
    fun setup() {
        recordedRequest = null
        server = MockWebServer()
        server.start()
        sdk = GeniusReferralsClient("test-token", server.url("/").toString())
    }

    @AfterEach
    fun teardown() {
        server.shutdown()
    }

    private fun enqueueOk(body: String = "{\"data\":[]}") {
        server.enqueue(MockResponse().setBody(body).setResponseCode(200))
    }

    private fun enqueueError(code: Int, body: String = "{\"message\":\"error\"}") {
        server.enqueue(MockResponse().setBody(body).setResponseCode(code))
    }

    private fun takeRecordedRequest(): RecordedRequest {
        val existing = recordedRequest
        if (existing != null) return existing

        val request = server.takeRequest(5, TimeUnit.SECONDS) ?: fail("Expected HTTP request")
        recordedRequest = request
        return request
    }

    private fun assertPath(expected: String) {
        val recorded = takeRecordedRequest()
        assertEquals(expected, recorded.path)
    }

    private fun assertMethod(expected: String) {
        val recorded = takeRecordedRequest()
        assertEquals(expected, recorded.method)
    }

    private fun assertBodyContains(expected: String) {
        val recorded = takeRecordedRequest()
        assertTrue(recorded.body.readUtf8().contains(expected))
    }

    // Roots
    @Test fun getRoot() {
        enqueueOk("{\"_links\":{}}")
        val result = sdk.roots.getRoot()
        assertTrue(result.contains("_links"))
        assertPath("/")
        assertMethod("GET")
    }

    // Authentications
    @Test fun getAuthentication() {
        enqueueOk("{\"status\":\"ok\"}")
        val result = sdk.authentications.getAuthentication()
        assertTrue(result.contains("ok"))
        assertPath("/test-authentication")
    }

    // Accounts
    @Test fun getAccounts() {
        enqueueOk()
        sdk.accounts.getAccounts(1, 10)
        assertPath("/accounts?page=1&limit=10")
    }

    @Test fun getAccount() {
        enqueueOk()
        sdk.accounts.getAccount("my-slug")
        assertPath("/accounts/my-slug")
    }

    @Test fun createAccount() {
        enqueueOk()
        sdk.accounts.createAccount(AccountForm(name = "Test"))
        assertMethod("POST")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"account\""))
    }

    @Test fun updateAccount() {
        enqueueOk()
        sdk.accounts.updateAccount("my-slug", AccountForm(name = "Updated"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"account\""))
    }

    @Test fun deleteAccount() {
        enqueueOk()
        sdk.accounts.deleteAccount("my-slug")
        assertMethod("DELETE")
        assertPath("/accounts/my-slug")
    }

    // Advocates
    @Test fun getAdvocates() {
        enqueueOk()
        sdk.advocates.getAdvocates("acct", 1, 10)
        assertPath("/accounts/acct/advocates?page=1&limit=10")
    }

    @Test fun getAdvocate() {
        enqueueOk()
        sdk.advocates.getAdvocate("acct", "tok")
        assertPath("/accounts/acct/advocates/tok")
    }

    @Test fun postAdvocate() {
        enqueueOk()
        sdk.advocates.postAdvocate("acct", AdvocateForm(firstname = "John", lastname = "Doe", email = "j@t.com"))
        val body = takeRecordedRequest().body.readUtf8()
        assertTrue(body.contains("\"advocate\""))
        assertTrue(body.contains("John"))
    }

    @Test fun putAdvocate() {
        enqueueOk()
        sdk.advocates.putAdvocate("acct", "tok", AdvocateForm(firstname = "J", lastname = "D", email = "j@t.com"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"advocate\""))
    }

    @Test fun patchAdvocate() {
        enqueueOk()
        sdk.advocates.patchAdvocate("acct", "tok", AdvocatePatchForm(firstname = "Updated"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"advocate\""))
        assertTrue(body.contains("Updated"))
    }

    @Test fun deleteAdvocate() {
        enqueueOk()
        sdk.advocates.deleteAdvocate("acct", "tok")
        assertMethod("DELETE")
        assertPath("/accounts/acct/advocates/tok")
    }

    @Test fun deleteAdvocatesBulk() {
        enqueueOk()
        sdk.advocates.deleteAdvocates("acct", "tok1,tok2")
        assertPath("/accounts/acct/advocates?advocates=tok1%2Ctok2")
    }

    @Test fun getAdvocateShareLinks() {
        enqueueOk()
        sdk.advocates.getAdvocateShareLinks("acct", "tok")
        assertPath("/accounts/acct/advocates/tok/share-links")
    }

    @Test fun getAdvocatePaymentMethods() {
        enqueueOk()
        sdk.advocates.getAdvocatePaymentMethods("acct", "tok", 1, 10)
        assertPath("/accounts/acct/advocates/tok/payment-methods?page=1&limit=10")
    }

    @Test fun postAdvocatePaymentMethod() {
        enqueueOk()
        sdk.advocates.postAdvocatePaymentMethod("acct", "tok", PaymentMethodForm(type = "paypal"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"advocate_payment_method\""))
    }

    @Test fun putAdvocatePaymentMethod() {
        enqueueOk()
        sdk.advocates.putAdvocatePaymentMethod("acct", "tok", "pm1", PaymentMethodForm(type = "paypal"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"advocate_payment_method\""))
    }

    // Bonuses
    @Test fun getBonuses() {
        enqueueOk()
        sdk.bonuses.getBonuses("acct", 1, 10)
        assertPath("/accounts/acct/bonuses?page=1&limit=10")
    }

    @Test fun postBonus() {
        enqueueOk()
        sdk.bonuses.postBonus("acct", ForceBonusForm(advocateToken = "tok", bonusType = "referral", amount = 10.0, currencyCode = "USD"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"bonus\""))
    }

    @Test fun forceBonus() {
        enqueueOk()
        sdk.bonuses.forceBonus("acct", ForceBonusForm(advocateToken = "tok", bonusType = "referral", amount = 5.0, currencyCode = "USD"))
        val req = takeRecordedRequest()
        assertTrue(req.path!!.contains("/force"))
        assertTrue(req.body.readUtf8().contains("\"bonus\""))
    }

    @Test fun deleteBonus() {
        enqueueOk()
        sdk.bonuses.deleteBonus("acct", "b1")
        assertMethod("DELETE")
    }

    @Test fun patchBonus() {
        enqueueOk()
        sdk.bonuses.patchBonus("acct", "b1", BonusPatchForm(status = "paid"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"bonus\""))
        assertTrue(body.contains("paid"))
    }

    @Test fun checkupBonuses() {
        enqueueOk()
        sdk.bonuses.checkupBonuses("acct")
        assertPath("/accounts/acct/bonuses/checkup")
    }

    @Test fun getBonusTraces() {
        enqueueOk()
        sdk.bonuses.getBonusTraces("acct", 1, 10)
        assertPath("/accounts/acct/bonuses/traces?page=1&limit=10")
    }

    @Test fun getBonusTags() {
        enqueueOk()
        sdk.bonuses.getBonusTags("acct", "b1")
        assertPath("/accounts/acct/bonuses/b1/tags")
    }

    @Test fun addBonusTag() {
        enqueueOk()
        sdk.bonuses.addBonusTag("acct", "b1", TagForm(name = "VIP"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"tag\""))
    }

    @Test fun removeBonusTag() {
        enqueueOk()
        sdk.bonuses.removeBonusTag("acct", "b1", "vip")
        assertMethod("DELETE")
        assertPath("/accounts/acct/bonuses/b1/tags/vip")
    }

    // Campaigns
    @Test fun getCampaigns() {
        enqueueOk()
        sdk.campaigns.getCampaigns("acct", 1, 10)
        assertPath("/accounts/acct/campaigns?page=1&limit=10")
    }

    @Test fun getCampaign() {
        enqueueOk()
        sdk.campaigns.getCampaign("acct", "camp")
        assertPath("/accounts/acct/campaigns/camp")
    }

    // Products
    @Test fun getProducts() {
        enqueueOk()
        sdk.products.getProducts("acct", 1, 10)
        assertPath("/accounts/acct/products?page=1&limit=10")
    }

    @Test fun createProduct() {
        enqueueOk()
        sdk.products.createProduct("acct", ProductForm(name = "Widget"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"product\""))
    }

    @Test fun updateProduct() {
        enqueueOk()
        sdk.products.updateProduct("acct", "prod", ProductForm(name = "Updated"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"product\""))
    }

    @Test fun deleteProduct() {
        enqueueOk()
        sdk.products.deleteProduct("acct", "prod")
        assertMethod("DELETE")
    }

    @Test fun getProductVariants() {
        enqueueOk()
        sdk.products.getProductVariants("acct", "prod", 1, 10)
        assertPath("/accounts/acct/products/prod/variants?page=1&limit=10")
    }

    @Test fun createProductVariant() {
        enqueueOk()
        sdk.products.createProductVariant("acct", "prod", VariantForm(title = "V1"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"variant\""))
    }

    @Test fun patchProductVariant() {
        enqueueOk()
        sdk.products.patchProductVariant("acct", "prod", "v1", VariantPatchForm(title = "Updated"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"variant\""))
        assertTrue(body.contains("Updated"))
    }

    @Test fun deleteProductVariant() {
        enqueueOk()
        sdk.products.deleteProductVariant("acct", "prod", "v1")
        assertMethod("DELETE")
    }

    @Test fun patchProductVariantPrice() {
        enqueueOk()
        sdk.products.patchProductVariantPrice("acct", "prod", "v1", "USD", PriceForm(amount = 29.99))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"price\""))
        assertTrue(body.contains("29.99"))
    }

    // Redemption Requests
    @Test fun getRedemptionRequests() {
        enqueueOk()
        sdk.redemptionRequests.getRedemptionRequests("acct", 1, 10)
        assertPath("/accounts/acct/redemption-requests?page=1&limit=10")
    }

    @Test fun postRedemptionRequest() {
        enqueueOk()
        sdk.redemptionRequests.postRedemptionRequest("acct",
            RedemptionRequestForm(advocateToken = "tok", amount = 50.0, currencyCode = "USD"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"redemption_request\""))
    }

    @Test fun patchRedemptionRequest() {
        enqueueOk()
        sdk.redemptionRequests.patchRedemptionRequest("acct", "r1", RedemptionRequestPatchForm(status = "approved"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"redemption_request\""))
        assertTrue(body.contains("approved"))
    }

    @Test fun patchRedemption() {
        enqueueOk()
        sdk.redemptionRequests.patchRedemption("acct", "r1", ProcessRedemptionForm(requestActionSlug = "process"))
        assertFalse(takeRecordedRequest().body.readUtf8().contains("\"redemption_request\""))
    }

    // Referrals
    @Test fun getReferrals() {
        enqueueOk()
        sdk.referrals.getReferrals("acct", "tok", 1, 10)
        assertPath("/accounts/acct/advocates/tok/referrals?page=1&limit=10")
    }

    @Test fun postReferral() {
        enqueueOk()
        sdk.referrals.postReferral("acct", "tok", ReferralForm(url = "http://example.com"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"referral\""))
    }

    @Test fun putReferral() {
        enqueueOk()
        sdk.referrals.putReferral("acct", "tok", "r1", ReferralForm(url = "http://updated.com"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"referral\""))
    }

    @Test fun deleteReferral() {
        enqueueOk()
        sdk.referrals.deleteReferral("acct", "tok", "r1")
        assertMethod("DELETE")
    }

    // Reports
    @Test fun getBonusesDailyGiven() {
        enqueueOk()
        sdk.reports.getBonusesDailyGiven("acct", "2026-01-01", "2026-01-31")
        assertTrue(takeRecordedRequest().path!!.contains("bonuses-daily-given"))
    }

    @Test fun get1099TaxReport() {
        enqueueOk()
        sdk.reports.get1099TaxReport("acct", 2025)
        assertTrue(takeRecordedRequest().path!!.contains("1099-tax-report"))
    }

    @Test fun getRevenue() {
        enqueueOk()
        sdk.reports.getRevenue("acct", "2026-01-01", "2026-12-31")
        assertTrue(takeRecordedRequest().path!!.contains("revenue"))
    }

    // Tags
    @Test fun getTags() {
        enqueueOk()
        sdk.tags.getTags("acct", 1, 10)
        assertPath("/accounts/acct/tags?page=1&limit=10")
    }

    @Test fun createTag() {
        enqueueOk()
        sdk.tags.createTag("acct", TagForm(name = "VIP"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"tag\""))
    }

    @Test fun updateTag() {
        enqueueOk()
        sdk.tags.updateTag("acct", "vip", TagForm(name = "VIP Updated"))
        assertMethod("PUT")
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"tag\""))
    }

    @Test fun deleteTag() {
        enqueueOk()
        sdk.tags.deleteTag("acct", "vip")
        assertMethod("DELETE")
    }

    // Vouchers
    @Test fun getVouchers() {
        enqueueOk()
        sdk.vouchers.getVouchers("acct", 1, 10)
        assertPath("/accounts/acct/vouchers?page=1&limit=10")
    }

    @Test fun createVoucher() {
        enqueueOk()
        sdk.vouchers.createVoucher("acct", VoucherForm(code = "ABC", value = 5.0, currencyCode = "USD"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"voucher\""))
    }

    @Test fun patchVoucher() {
        enqueueOk()
        sdk.vouchers.patchVoucher("acct", "v1", VoucherPatchForm(status = "used"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"voucher\""))
        assertTrue(body.contains("used"))
    }

    @Test fun deleteVoucher() {
        enqueueOk()
        sdk.vouchers.deleteVoucher("acct", "v1")
        assertMethod("DELETE")
    }

    // Widgets Packages
    @Test fun getWidgetsPackages() {
        enqueueOk()
        sdk.widgetsPackages.getWidgetsPackages("acct", 1, 10)
        assertTrue(takeRecordedRequest().path!!.contains("widgets-packages"))
    }

    @Test fun createWidgetsPackage() {
        enqueueOk()
        sdk.widgetsPackages.createWidgetsPackage("acct", WidgetsPackageForm(name = "Pkg"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"widgets_package\""))
    }

    @Test fun createWidget() {
        enqueueOk()
        sdk.widgetsPackages.createWidget("acct", "pkg", WidgetForm(type = "referral"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"widget\""))
    }

    @Test fun patchWidget() {
        enqueueOk()
        sdk.widgetsPackages.patchWidget("acct", "pkg", "w1", WidgetPatchForm(name = "Updated"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"widget\""))
        assertTrue(body.contains("Updated"))
    }

    @Test fun createWidgetTranslation() {
        enqueueOk()
        sdk.widgetsPackages.createWidgetTranslation("acct", "pkg", "w1", WidgetTranslationForm(locale = "en"))
        assertTrue(takeRecordedRequest().body.readUtf8().contains("\"widget_translation\""))
    }

    @Test fun patchWidgetTranslation() {
        enqueueOk()
        sdk.widgetsPackages.patchWidgetTranslation("acct", "pkg", "w1", "en", WidgetTranslationPatchForm(title = "Updated"))
        val body = takeRecordedRequest().body.readUtf8()
        assertMethod("PATCH")
        assertFalse(body.contains("\"widget_translation\""))
        assertTrue(body.contains("Updated"))
    }

    // Utilities
    @Test fun getCurrencies() {
        enqueueOk()
        sdk.utilities.getCurrencies(1, 10)
        assertPath("/currencies?page=1&limit=10")
    }

    @Test fun getBonusRedemptionMethods() {
        enqueueOk()
        sdk.utilities.getBonusRedemptionMethods(1, 10)
        assertTrue(takeRecordedRequest().path!!.contains("bonus-redemption-methods"))
    }

    @Test fun getPaymentMethodsList() {
        enqueueOk()
        sdk.utilities.getPaymentMethodsList(1, 10)
        assertTrue(takeRecordedRequest().path!!.contains("payment-methods"))
    }

    @Test fun getReferralOrigins() {
        enqueueOk()
        sdk.utilities.getReferralOrigins(1, 10)
        assertTrue(takeRecordedRequest().path!!.contains("referral-origins"))
    }

    // Error handling
    @Test fun error401() {
        enqueueError(401)
        assertThrows<ApiException> { sdk.authentications.getAuthentication() }
    }

    @Test fun error403() {
        enqueueError(403)
        assertThrows<ApiException> { sdk.accounts.getAccounts() }
    }

    @Test fun error404() {
        enqueueError(404)
        assertThrows<ApiException> { sdk.accounts.getAccount("missing") }
    }
}
