package com.news.sm.services.model.response

/**
 * Created by sharanamma on 02/04/22.
 */
data class Articles(
    val source: Source,
    val author: String? = null,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)
