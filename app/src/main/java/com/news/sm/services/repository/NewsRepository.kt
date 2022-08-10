package com.news.sm.services.repository

import com.news.sm.services.model.response.Articles
import com.news.sm.services.network.APIRetrofitInterface
import com.news.sm.services.network.NetworkService
import com.news.sm.services.network.RetrofitBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by sharanamma on 02/04/22.
 */
class NewsRepository {
    private val retrofitService: NetworkService =
        NetworkService(RetrofitBuilder.buildService(APIRetrofitInterface::class.java))

    suspend fun getLatestNews(): List<Articles> {
        return withContext(Dispatchers.IO) {
            return@withContext retrofitService.getLatestNews()
        }
    }
}