package com.spread.currencyconverter.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity
import com.spread.currencyconverter.data.onError
import com.spread.currencyconverter.data.onSuccess
import com.spread.currencyconverter.repositories.CurrenciesRepository
import com.spread.currencyconverter.ui.states.MainState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrenciesVM @Inject constructor(private val currenciesRepository: CurrenciesRepository) :
    ViewModel() {
    private val _currenciesState = MutableStateFlow(MainState<List<CurrenciesEntity>>())
    val currenciesState = _currenciesState.asStateFlow()


    fun fetchCurrencies(currency:String = "USD") = viewModelScope.launch {
        currenciesRepository.getCurrencies(currency).onSuccess { c ->
            _currenciesState.update { it.successWith(c) }
        }.onError { er ->
            _currenciesState.update { it.failureWith(er) }
        }
    }
}