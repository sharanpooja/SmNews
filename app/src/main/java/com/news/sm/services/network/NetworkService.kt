package com.news.sm.services.network

import com.news.sm.services.model.response.Articles

/**
 * Created by sharanamma on 01/04/22.
 */
class NetworkService(private val apiInterface: APIRetrofitInterface) : APIContract {
    override suspend fun getLatestNews(): List<Articles> {
        try {
            val response = apiInterface.getLatestNews()
            return if (response.isSuccessful) {
                response.body()?.newsList ?: emptyList()
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            e.printStackTrace();
        }
        return emptyList()
    }
}