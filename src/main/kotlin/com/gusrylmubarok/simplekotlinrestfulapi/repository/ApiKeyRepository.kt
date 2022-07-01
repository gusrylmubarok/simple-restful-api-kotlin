package com.gusrylmubarok.simplekotlinrestfulapi.repository

import com.gusrylmubarok.simplekotlinrestfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}