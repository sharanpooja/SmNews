package com.news.sm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.news.sm.services.NewsInjection
import com.news.sm.services.model.response.Articles
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = NewsInjection.getRepository()
    private val _newsList = MutableLiveData<List<Articles>>()
    val newsList: LiveData<List<Articles>>
        get() = _newsList


    suspend fun getLatestNews() {
        viewModelScope.launch {
            _newsList.value = repository.getLatestNews()
        }
    }
}