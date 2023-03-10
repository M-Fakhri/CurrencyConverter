package com.spread.currencyconverter.repositories

import android.util.Log
import com.spread.currencyconverter.data.DataResult
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity
import com.spread.currencyconverter.data.models.mapper.toCurrencies
import com.spread.currencyconverter.data.models.mapper.toList
import com.spread.currencyconverter.dataSources.CurrenciesLocalDataSource
import com.spread.currencyconverter.dataSources.CurrenciesRemoteDataSource
import com.spread.currencyconverter.network.onError
import com.spread.currencyconverter.network.onSuccess

class CurrenciesRepository(
    private val localDataSource: CurrenciesLocalDataSource,
    private val remoteDataSource: CurrenciesRemoteDataSource
) {
    suspend fun getCurrencies(): DataResult<List<CurrenciesEntity>> {
        val res = remoteDataSource.fetchCurrencies()
        res.onSuccess {
            val currenciesList = it?.rates.toList()
            currenciesList.let { c ->
                localDataSource.insertCurrencies(c.toCurrencies()) }
        }.onError {
            Log.e("TAG", "getCurrencies: $it" )
        }
        return DataResult.Success(data = localDataSource.getCurrencies())
    }
}