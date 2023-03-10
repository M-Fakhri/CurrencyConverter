package com.spread.currencyconverter.data.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity

@Dao
abstract class CurrenciesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertCurrency(currency: CurrenciesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertCurrencies(currencies: List<CurrenciesEntity>)

    @Query("SELECT * FROM CurrenciesEntity")
    abstract suspend fun getCurrencies(): List<CurrenciesEntity>
}