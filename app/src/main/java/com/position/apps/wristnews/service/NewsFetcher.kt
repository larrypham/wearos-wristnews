package com.position.apps.wristnews.service

import com.position.apps.wristnews.domain.model.Article
import io.ktor.client.HttpClient

import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.json

object NewsFetcher {
    private const val BASE_URL = ""

    private val httpClient = HttpClient() {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getArticles(): List<Article> {
        return httpClient.get("$BASE_URL/articles").body<List<Article>>().asReversed()
    }
}