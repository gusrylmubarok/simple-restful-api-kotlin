package com.gusrylmubarok.simplekotlinrestfulapi.service

import com.gusrylmubarok.simplekotlinrestfulapi.model.CreateProductRequest
import com.gusrylmubarok.simplekotlinrestfulapi.model.ListProductRequest
import com.gusrylmubarok.simplekotlinrestfulapi.model.ProductResponse
import com.gusrylmubarok.simplekotlinrestfulapi.model.UpdateProductRequest

interface ProductService {
    fun create(createProductRequest: CreateProductRequest): ProductResponse
    fun get(id: String): ProductResponse
    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse
    fun delete(id: String)
    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}