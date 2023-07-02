package com.position.apps.wristnews.service

import com.position.apps.wristnews.domain.model.Article
import com.position.apps.wristnews.utils.K
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json

object ArticlesFetcher {

    private val httpClient = HttpClient(Android) {
        install(Logging)
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getArticles(): List<Article> {
        return httpClient.get("${K.BASE_URL}${K.API_KEY}").body<List<Article>>().asReversed()
    }
}