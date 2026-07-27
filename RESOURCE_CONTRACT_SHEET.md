# Android SDK Resource Contract Sheet
# Generated: 2026-07-26
# SOP Step 1: Build the resource contract sheet before editing code
# Source: C# SDK resource contract sheet + API docs

## Rewrite: Java/Volley -> Kotlin/OkHttp + Coroutines

## Resource: Roots
- Controller: RootsController
- Endpoints: GET /
- Write methods: none
- Object class: n/a (HATEOAS links response)
- Form class: n/a

## Resource: Authentications
- Controller: AuthenticationsController
- Endpoints: GET /test-authentication
- Write methods: none
- Object class: n/a
- Form class: n/a

## Resource: Accounts
- Controller: AccountsController
- Endpoints: GET /accounts, GET /accounts/{slug}, POST /accounts, PUT /accounts/{slug}, DELETE /accounts/{slug}
- Write methods: POST (wrapper: "account", AccountForm), PUT (wrapper: "account", AccountForm)
- Object class: Account
- Form class: AccountForm
- Patch class: n/a

## Resource: Advocates
- Controller: AdvocatesController
- Endpoints: GET list, GET single, POST, PUT, PATCH, DELETE, DELETE bulk, GET share-links, GET payment-methods, GET payment-method single, POST payment-method, PUT payment-method
- Write methods: POST (wrapper: "advocate", AdvocateForm), PUT (wrapper: "advocate", AdvocateForm), PATCH (bare, AdvocatePatchForm)
- Object class: Advocate
- Form class: AdvocateForm, AdvocatePatchForm
- Nested DTOs: PaymentMethod, PaymentMethodForm (wrapper: "advocate_payment_method")

## Resource: Bonuses
- Controller: BonusesController
- Endpoints: GET list, GET single, POST, POST force, DELETE, PATCH, GET checkup, GET traces, GET trace, GET tags, POST tag, DELETE tag
- Write methods: POST (wrapper: "bonus", BonusesForm), POST force (wrapper: "bonus", ForceBonusesForm), PATCH (bare, BonusPatchForm)
- Object class: Bonus, Bonuses
- Form class: BonusesForm, ForceBonusesForm, BonusPatchForm
- Nested DTOs: Tag, TagForm (wrapper: "tag")

## Resource: Campaigns
- Controller: CampaignsController
- Endpoints: GET list, GET single
- Write methods: none (read-only)

## Resource: Products
- Controller: ProductsController
- Endpoints: GET list, GET single, POST, PUT, DELETE, GET variants, POST variant, PATCH variant, DELETE variant, PATCH price
- Write methods: POST (wrapper: "product", ProductForm), PUT (wrapper: "product", ProductForm), POST variant (wrapper: "variant", VariantForm), PATCH variant (bare, VariantPatchForm), PATCH price (bare, PriceForm)
- Object class: Product, Variant, Price
- Form class: ProductForm, VariantForm, VariantPatchForm, PriceForm
- Nested DTOs: Variant[] in product, Price in variant

## Resource: Redemption Requests
- Controller: RedemptionRequestsController
- Endpoints: GET list, GET single, POST, PATCH update, PATCH redemption
- Write methods: POST (wrapper: "redemption_request", RedemptionRequestForm), PATCH (bare, RedemptionRequestPatchForm), PATCH redemption (bare, ProcessRedemptionForm)
- Object class: RedemptionRequest
- Form class: RedemptionRequestForm, RedemptionRequestPatchForm, ProcessRedemptionForm

## Resource: Referrals
- Controller: ReferralsController
- Endpoints: GET list, GET single, POST, PUT, DELETE
- Write methods: POST (wrapper: "referral", ReferralForm), PUT (wrapper: "referral", ReferralForm)
- Object class: Referral
- Form class: ReferralForm

## Resource: Reports
- Controller: ReportsController
- Endpoints: 9 read-only endpoints (bonuses-daily-given, click-daily-participation, share-daily-participation, 1099-tax-report, revenue, etc.)
- Write methods: none

## Resource: Tags
- Controller: TagsController
- Endpoints: GET list, GET single, POST, PUT, DELETE
- Write methods: POST (wrapper: "tag", TagForm), PUT (wrapper: "tag", TagForm)
- Object class: Tag
- Form class: TagForm

## Resource: Vouchers
- Controller: VouchersController
- Endpoints: GET list, GET single, POST, PATCH, DELETE, GET denominations
- Write methods: POST (wrapper: "voucher", VoucherForm), PATCH (bare, VoucherPatchForm)
- Object class: Voucher
- Form class: VoucherForm, VoucherPatchForm

## Resource: Widgets Packages
- Controller: WidgetsPackagesController
- Endpoints: GET list, GET single, POST, PUT, DELETE, GET widgets, GET widget, POST widget, PATCH widget, PUT widget, DELETE widget, GET translations, GET translation, POST translation, PATCH translation
- Write methods: POST (wrapper: "widgets_package", WidgetsPackageForm), PUT (wrapper: "widgets_package", WidgetsPackageForm), POST widget (wrapper: "widget", WidgetForm), PATCH widget (bare, WidgetPatchForm), PUT widget (wrapper: "widget", WidgetForm), POST translation (wrapper: "widget_translation", WidgetTranslationForm), PATCH translation (bare, WidgetTranslationPatchForm)
- Object class: WidgetsPackage, Widget, WidgetTranslation
- Form class: WidgetsPackageForm, WidgetForm, WidgetPatchForm, WidgetTranslationForm, WidgetTranslationPatchForm
- Nested DTOs: Widget[] in widgets package, WidgetTranslation[] in widget

## Resource: Utilities
- Controller: UtilitiesController
- Endpoints: 11 read-only endpoints (currencies, bonus-redemption-methods, payment-methods, redemption-request-actions, redemption-request-statuses, referral-origins)
- Write methods: none

## Missing from old Android SDK (must add):
- Controllers: Products, Tags, Vouchers, WidgetsPackages, Utilities (5 new)
- Models: Account, AccountForm, Bonus, BonusForm, BonusPatchForm, Tag, TagForm, Voucher, VoucherForm, VoucherPatchForm, WidgetsPackage, WidgetsPackageForm, Widget, WidgetForm, WidgetPatchForm, WidgetTranslation, WidgetTranslationForm, WidgetTranslationPatchForm, Product, ProductForm, Variant, VariantForm, VariantPatchForm, Price, PriceForm (24 new)
- PATCH support on Advocates, Bonuses (missing from old SDK)
- Payment methods sub-resource (missing from old SDK)
- Bonus tags sub-resource (missing from old SDK)