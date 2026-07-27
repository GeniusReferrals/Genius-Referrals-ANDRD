package com.geniusreferrals.api

import com.geniusreferrals.api.controllers.AccountsController
import com.geniusreferrals.api.controllers.AdvocatesController
import com.geniusreferrals.api.controllers.AuthenticationsController
import com.geniusreferrals.api.controllers.BonusesController
import com.geniusreferrals.api.controllers.CampaignsController
import com.geniusreferrals.api.controllers.ProductsController
import com.geniusreferrals.api.controllers.RedemptionRequestsController
import com.geniusreferrals.api.controllers.ReferralsController
import com.geniusreferrals.api.controllers.ReportsController
import com.geniusreferrals.api.controllers.RootsController
import com.geniusreferrals.api.controllers.TagsController
import com.geniusreferrals.api.controllers.UtilitiesController
import com.geniusreferrals.api.controllers.VouchersController
import com.geniusreferrals.api.controllers.WidgetsPackagesController

class GeniusReferralsClient(
    authToken: String,
    baseUrl: String = "https://api.geniusreferrals.com"
) {
    private val config = Configuration(authToken = authToken, baseUrl = baseUrl)
    private val client = GRClient(config)

    val roots = RootsController(client)
    val authentications = AuthenticationsController(client)
    val accounts = AccountsController(client)
    val advocates = AdvocatesController(client)
    val bonuses = BonusesController(client)
    val campaigns = CampaignsController(client)
    val products = ProductsController(client)
    val redemptionRequests = RedemptionRequestsController(client)
    val referrals = ReferralsController(client)
    val reports = ReportsController(client)
    val tags = TagsController(client)
    val vouchers = VouchersController(client)
    val widgetsPackages = WidgetsPackagesController(client)
    val utilities = UtilitiesController(client)
}