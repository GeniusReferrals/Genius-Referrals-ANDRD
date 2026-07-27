package com.geniusreferrals.api.controllers

import com.geniusreferrals.api.GRClient
import com.geniusreferrals.api.Json
import com.geniusreferrals.api.models.PriceForm
import com.geniusreferrals.api.models.ProductForm
import com.geniusreferrals.api.models.VariantForm
import com.geniusreferrals.api.models.VariantPatchForm

class ProductsController(private val client: GRClient) {

    fun getProducts(accountSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/products", mapOf("page" to page, "limit" to limit))

    fun getProduct(accountSlug: String, productSlug: String): String =
        client.get("/accounts/$accountSlug/products/$productSlug")

    fun createProduct(accountSlug: String, form: ProductForm): String =
        client.post("/accounts/$accountSlug/products", Json.toJsonWithWrapper("product", form))

    fun updateProduct(accountSlug: String, productSlug: String, form: ProductForm): String =
        client.put("/accounts/$accountSlug/products/$productSlug", Json.toJsonWithWrapper("product", form))

    fun deleteProduct(accountSlug: String, productSlug: String): String =
        client.delete("/accounts/$accountSlug/products/$productSlug")

    fun getProductVariants(accountSlug: String, productSlug: String, page: Int = 1, limit: Int = 10): String =
        client.get("/accounts/$accountSlug/products/$productSlug/variants", mapOf("page" to page, "limit" to limit))

    fun createProductVariant(accountSlug: String, productSlug: String, form: VariantForm): String =
        client.post("/accounts/$accountSlug/products/$productSlug/variants", Json.toJsonWithWrapper("variant", form))

    fun patchProductVariant(accountSlug: String, productSlug: String, variantId: String, form: VariantPatchForm): String =
        client.patch("/accounts/$accountSlug/products/$productSlug/variants/$variantId", Json.toJson(form))

    fun deleteProductVariant(accountSlug: String, productSlug: String, variantId: String): String =
        client.delete("/accounts/$accountSlug/products/$productSlug/variants/$variantId")

    fun patchProductVariantPrice(accountSlug: String, productSlug: String, variantId: String, currencyCode: String, form: PriceForm): String =
        client.patch("/accounts/$accountSlug/products/$productSlug/variants/$variantId/prices/$currencyCode", Json.toJson(form))
}