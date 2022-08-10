package com.news.sm.services.model.response

/**
 * Created by sharanamma on 02/04/22.
 */
data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val newsList: MutableList<Articles>
)
