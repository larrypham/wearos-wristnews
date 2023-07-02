package com.position.apps.wristnews.utils

sealed class ViewState {
    object Loading: ViewState()
    class Success<T>(val data: T): ViewState()
    class Error(val message: String): ViewState()
}