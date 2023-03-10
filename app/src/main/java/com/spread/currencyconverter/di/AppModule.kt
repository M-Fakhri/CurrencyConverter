package com.spread.currencyconverter.di

import android.content.Context
import com.spread.currencyconverter.data.database.AppDatabase
import com.spread.currencyconverter.dataSources.CurrenciesLocalDataSource
import com.spread.currencyconverter.dataSources.CurrenciesRemoteDataSource
import com.spread.currencyconverter.network.APIs
import com.spread.currencyconverter.network.Client
import com.spread.currencyconverter.repositories.CurrenciesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideRetrofitInstance(): APIs = Client.getClient()

    @Provides
    @Singleton
    fun provideDatabaseInstance(@ApplicationContext context: Context): AppDatabase =
        AppDatabase.getDatabase(context)

    @Provides
    @Singleton
    fun ProvideCurrenciesLocalDataSource(appDatabase: AppDatabase): CurrenciesLocalDataSource =
        CurrenciesLocalDataSource(appDatabase)

    @Provides
    @Singleton
    fun ProvideCurrenciesRemoteDataSource(apIs: APIs): CurrenciesRemoteDataSource =
        CurrenciesRemoteDataSource(apIs)

    @Provides
    @Singleton
    fun provideCurrenciesRepository(
        localDataSource: CurrenciesLocalDataSource,
        remoteDataSource: CurrenciesRemoteDataSource
    ): CurrenciesRepository =
        CurrenciesRepository(localDataSource, remoteDataSource)
}