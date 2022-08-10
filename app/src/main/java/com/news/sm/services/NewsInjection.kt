package com.news.sm.services

import com.news.sm.services.repository.NewsRepository

/**
 * Created by sharanamma on 05/04/22.
 */
object NewsInjection {
    private var repository: NewsRepository? = null

    fun getRepository(): NewsRepository {
        return if (repository == null) {
            repository = NewsRepository()
            repository!!
        } else {
            repository!!
        }
    }
}