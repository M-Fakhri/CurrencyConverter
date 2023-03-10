package com.spread.currencyconverter.dataSources

import com.spread.currencyconverter.data.database.AppDatabase
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity

class CurrenciesLocalDataSource(private val db: AppDatabase) {
    suspend fun insertCurrencies(currencies: List<CurrenciesEntity>) {
        db.currenciesDao().insertCurrencies(currencies)
    }

    suspend fun getCurrencies(): List<CurrenciesEntity> {
        return db.currenciesDao().getCurrencies()
    }
}