package com.position.apps.wristnews.domain.repository

import com.position.apps.wristnews.service.ArticlesFetcher
import com.position.apps.wristnews.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ArticlesRepository {
    suspend fun fetchArticles(): Result {
        return withContext(Dispatchers.IO) {
            try {
                val result = ArticlesFetcher.getArticles()
                Result.SuccessWithData(result)
            } catch (exception: Exception) {
                Result.Error(exception)
            }
        }
    }
}