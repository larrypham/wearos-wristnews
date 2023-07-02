package com.position.apps.wristnews.utils

sealed class Result {
    class SuccessWithData<T>(val data: T): Result()
    class Error(val exception: Exception): Result()
}