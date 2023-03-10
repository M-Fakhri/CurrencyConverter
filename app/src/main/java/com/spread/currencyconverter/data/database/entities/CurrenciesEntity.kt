package com.spread.currencyconverter.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrenciesEntity(
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0,
    var name: String = "",
    var value: Double = 0.0,
    )