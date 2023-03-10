package com.spread.currencyconverter.dataSources

import com.spread.currencyconverter.data.models.responses.CurrenciesResponse
import com.spread.currencyconverter.network.APIs
import com.spread.currencyconverter.network.NetworkResult
import com.spread.currencyconverter.network.responseDelegate

class CurrenciesRemoteDataSource(private val api: APIs) {
    suspend fun fetchCurrencies(): NetworkResult<CurrenciesResponse?> {
        return try {
            NetworkResult.Success(api.getCurrencies().body())
        } catch (e: Exception) {
            NetworkResult.Failure("Something Went Wrong")
        }
    }
}