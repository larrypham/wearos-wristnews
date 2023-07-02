package com.position.apps.wristnews.navigation

sealed class Screen (val route: String) {
    object Welcome: Screen("welcome")

    object News: Screen("news")

    object Details: Screen("news/{articleId}") {
        const val ARG_ARTICLE_ID: String = "articleId"

        fun route(articleId: String) = "news/$articleId"
    }
}