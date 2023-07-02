package com.position.apps.wristnews.utils

sealed class Either<out F, out S> {

    data class Failure<out F> internal constructor(val value: F): Either<F, Nothing>() {
        companion object {
            operator fun <F> invoke(func: F): Either<F, Nothing> = Failure(func)
        }
    }

    data class Success<out S> internal constructor(val value: S): Either<Nothing, S>() {
        companion object {
            operator fun <S> invoke(func: S): Either<Nothing, S> = Success(func)
        }
    }

    companion object {
        fun <S> success(value: S): Either<Nothing, S> = Success(value)
        fun <F> failure(value: F): Either<F, Nothing> = Failure(value)
    }
}