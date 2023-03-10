package com.spread.currencyconverter.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.spread.currencyconverter.data.database.daos.CurrenciesDao
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity

@Database(entities = [CurrenciesEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        private const val DB_NAME = "CurrenciesDB"

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) { buildDatabase(context) }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DB_NAME
            )
                .build()
            return INSTANCE!!
        }
    }

    abstract fun currenciesDao(): CurrenciesDao
}
