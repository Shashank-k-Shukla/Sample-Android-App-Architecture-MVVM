package com.example.samplemvvmandroidarchitecture.store.domain.model

data class NetworkError(
    val message: String,
    val t: Throwable? = null
)

enum class ApiError(val message: String){
    NetworkError("Network Error"),
    UnknownResponse("Unknown Response"),
    UnknownError("Unknown Error"),
}