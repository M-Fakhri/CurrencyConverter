package com.spread.currencyconverter.network

import com.spread.currencyconverter.data.models.responses.CurrenciesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface APIs {
    @GET("latest/{currency}")
    suspend fun getCurrencies(
        @Path("currency") currency: String,
    ): Response<CurrenciesResponse>
}