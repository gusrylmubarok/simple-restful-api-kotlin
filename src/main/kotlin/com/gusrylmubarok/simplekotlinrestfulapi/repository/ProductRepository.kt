package com.gusrylmubarok.simplekotlinrestfulapi.repository

import com.gusrylmubarok.simplekotlinrestfulapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}