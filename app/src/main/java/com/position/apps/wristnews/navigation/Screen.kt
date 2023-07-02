package com.position.apps.wristnews.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavBackStackEntry

sealed class Screen (val route: String) {
    object Welcome: Screen("welcome")

    object Articles: Screen("articles")

    object Article: Screen("articles/{articleId}") {
        const val ARG_ARTICLE_ID: String = "articleId"

        fun route(articleId: String) = "news/$articleId"
    }
}

@Composable
inline fun <reified VM: ViewModel> NavBackStackEntry.hiltNavGraphViewModel(): VM {
    val viewModelFactory = HiltViewModelFactory(LocalContext.current, this)
    return ViewModelProvider(this, viewModelFactory)[VM::class.java]
}