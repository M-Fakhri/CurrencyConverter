package com.spread.currencyconverter.data.models.mapper

import com.spread.currencyconverter.data.models.responses.Rates

class Mapper {
    fun Rates.toList(): List<Pair<String, Double?>> =
        listOf(
            Pair("USD", this.uSD),
            Pair("AED", this.aED),
            Pair("AFN", this.aFN),
            Pair("ALL", this.aLL),
            Pair("AMD", this.aMD),
            Pair("ANG", this.aNG),
            Pair("AOA", this.aOA),
            Pair("ARS", this.aRS),
            Pair("AUD", this.aUD),
            Pair("AWG", this.aWG),
            Pair("AZN", this.aZN),
            Pair("BAM", this.bAM),
            Pair("BBD", this.bBD),
            Pair("BDT", this.bDT),
            Pair("BGN", this.bGN)
            //Convert as long as possible
        )

}