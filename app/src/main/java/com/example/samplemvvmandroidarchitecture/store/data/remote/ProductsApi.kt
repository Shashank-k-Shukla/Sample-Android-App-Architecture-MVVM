package com.example.samplemvvmandroidarchitecture.store.data.remote

import com.example.samplemvvmandroidarchitecture.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun getProducts(): List<Product>

}