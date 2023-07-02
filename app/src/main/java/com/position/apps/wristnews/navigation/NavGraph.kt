package com.position.apps.wristnews.navigation

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable

@Composable
fun NavGraph(
    navController: NavHostController,
    backDispatcher: OnBackPressedDispatcher,
) {
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = Screen.Welcome.route,
    ) {
        composable(Screen.Welcome.route) {

        }

        composable(Screen.Articles.route) {

        }

        composable(Screen.Article.route) {

        }
    }
}