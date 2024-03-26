package com.example.samplemvvmandroidarchitecture.store.data.mapper

import com.example.samplemvvmandroidarchitecture.store.domain.model.ApiError
import com.example.samplemvvmandroidarchitecture.store.domain.model.NetworkError
import okio.IOException
import retrofit2.HttpException

fun Throwable.toNetworkError(): NetworkError {
    val error = when (this) {
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        message = error.toString(),
        t = this
    )
}