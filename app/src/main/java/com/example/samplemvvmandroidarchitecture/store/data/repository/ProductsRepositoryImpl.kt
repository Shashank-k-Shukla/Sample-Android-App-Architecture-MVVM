package com.example.samplemvvmandroidarchitecture.store.data.repository

import arrow.core.Either
import com.example.samplemvvmandroidarchitecture.store.data.mapper.toNetworkError
import com.example.samplemvvmandroidarchitecture.store.data.remote.ProductsApi
import com.example.samplemvvmandroidarchitecture.store.domain.model.NetworkError
import com.example.samplemvvmandroidarchitecture.store.domain.model.Product
import com.example.samplemvvmandroidarchitecture.store.domain.repository.ProductsRepository
import kotlinx.coroutines.CancellationException
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toNetworkError() }
    }
}