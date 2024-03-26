package com.example.samplemvvmandroidarchitecture.store.domain.repository

import arrow.core.Either
import com.example.samplemvvmandroidarchitecture.store.domain.model.NetworkError
import com.example.samplemvvmandroidarchitecture.store.domain.model.Product

interface ProductsRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}