package com.news.sm.services.network

import com.news.sm.services.model.response.Articles
import retrofit2.Response

/**
 * Created by sharanamma on 01/04/22.
 */
interface APIContract {
    suspend fun getLatestNews(): List<Articles>
}