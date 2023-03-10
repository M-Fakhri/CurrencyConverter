package com.spread.currencyconverter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.spread.currencyconverter.R
import com.spread.currencyconverter.data.database.entities.CurrenciesEntity
import com.spread.currencyconverter.databinding.ActivityMainBinding
import com.spread.currencyconverter.ui.states.Status
import com.spread.currencyconverter.viewmodels.CurrenciesVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val vm: CurrenciesVM by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        observeStates()
        vm.fetchCurrencies()
    }

    private fun observeStates() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                vm.currenciesState.collect {
                    when (it.status) {
                        Status.Success -> {
                            fillSpinner(it.data)
                        }
                        Status.Failure -> {
                            Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT)
                                .show()
                        }
                        else -> {}
                    }
                }
            }
        }
    }

    private fun fillSpinner(data: List<CurrenciesEntity>?) {
        val items = data.let { it?.map { s -> s.name } }
        binding.cSp.setItems(items ?: listOf())
    }

    private fun initViews() {
        binding.apply {
            cSp.setOnSpinnerItemSelectedListener<String> { _, _, _, item ->
                label2.text = (vm.currenciesState.value.data?.find { it.name == item }?.value
                    ?: 0.0).toString()
            }
        }
    }
}