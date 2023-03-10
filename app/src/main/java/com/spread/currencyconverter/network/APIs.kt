package com.spread.currencyconverter.network

import com.spread.currencyconverter.data.models.responses.CurrenciesResponse
import retrofit2.Response
import retrofit2.http.GET

interface APIs {
    @GET("latest/USD")
    suspend fun getCurrencies(
    ): Response<CurrenciesResponse>
}