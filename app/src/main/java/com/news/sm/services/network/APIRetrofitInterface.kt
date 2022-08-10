package com.news.sm.services.network

import com.news.sm.services.model.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by sharanamma on 01/04/22.
 */
interface APIRetrofitInterface {
    @GET("top-headlines/category/health/in.json")
    suspend fun getLatestNews(): Response<NewsResponse>
}