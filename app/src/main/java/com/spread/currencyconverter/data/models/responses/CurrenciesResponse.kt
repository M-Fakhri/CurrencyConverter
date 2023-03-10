package com.spread.currencyconverter.data.models.responses


import android.util.Log
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

data class CurrenciesResponse(
    @SerializedName("result")
    val result: String? = null,
    @SerializedName("provider")
    val provider: String? = null,
    @SerializedName("documentation")
    val documentation: String? = null,
    @SerializedName("terms_of_use")
    val termsOfUse: String? = null,
    @SerializedName("time_last_update_unix")
    val timeLastUpdateUnix: Log? = null,
    @SerializedName("time_last_update_utc")
    val timeLastUpdateUtc: String? = null,
    @SerializedName("time_next_update_unix")
    val timeNextUpdateUnix: Long? = null,
    @SerializedName("time_next_update_utc")
    val timeNextUpdateUtc: String? = null,
    @SerializedName("time_eol_unix")
    val timeEolUnix: Long? = null,
    @SerializedName("base_code")
    val baseCode: String? = null,
    @SerializedName("rates")
    val rates: Rates? = null
)

@Keep
data class Rates(
    @SerializedName("USD")
    val uSD: Double? = null,
    @SerializedName("AED")
    val aED: Double? = null,
    @SerializedName("AFN")
    val aFN: Double? = null,
    @SerializedName("ALL")
    val aLL: Double? = null,
    @SerializedName("AMD")
    val aMD: Double? = null,
    @SerializedName("ANG")
    val aNG: Double? = null,
    @SerializedName("AOA")
    val aOA: Double? = null,
    @SerializedName("ARS")
    val aRS: Double? = null,
    @SerializedName("AUD")
    val aUD: Double? = null,
    @SerializedName("AWG")
    val aWG: Double? = null,
    @SerializedName("AZN")
    val aZN: Double? = null,
    @SerializedName("BAM")
    val bAM: Double? = null,
    @SerializedName("BBD")
    val bBD: Double? = null,
    @SerializedName("BDT")
    val bDT: Double? = null,
    @SerializedName("BGN")
    val bGN: Double? = null,
    @SerializedName("BHD")
    val bHD: Double? = null,
    @SerializedName("BIF")
    val bIF: Double? = null,
    @SerializedName("BMD")
    val bMD: Double? = null,
    @SerializedName("BND")
    val bND: Double? = null,
    @SerializedName("BOB")
    val bOB: Double? = null,
    @SerializedName("BRL")
    val bRL: Double? = null,
    @SerializedName("BSD")
    val bSD: Double? = null,
    @SerializedName("BTN")
    val bTN: Double? = null,
    @SerializedName("BWP")
    val bWP: Double? = null,
    @SerializedName("BYN")
    val bYN: Double? = null,
    @SerializedName("BZD")
    val bZD: Double? = null,
    @SerializedName("CAD")
    val cAD: Double? = null,
    @SerializedName("CDF")
    val cDF: Double? = null,
    @SerializedName("CHF")
    val cHF: Double? = null,
    @SerializedName("CLP")
    val cLP: Double? = null,
    @SerializedName("CNY")
    val cNY: Double? = null,
    @SerializedName("COP")
    val cOP: Double? = null,
    @SerializedName("CRC")
    val cRC: Double? = null,
    @SerializedName("CUP")
    val cUP: Double? = null,
    @SerializedName("CVE")
    val cVE: Double? = null,
    @SerializedName("CZK")
    val cZK: Double? = null,
    @SerializedName("DJF")
    val dJF: Double? = null,
    @SerializedName("DKK")
    val dKK: Double? = null,
    @SerializedName("DOP")
    val dOP: Double? = null,
    @SerializedName("DZD")
    val dZD: Double? = null,
    @SerializedName("EGP")
    val eGP: Double? = null,
    @SerializedName("ERN")
    val eRN: Double? = null,
    @SerializedName("ETB")
    val eTB: Double? = null,
    @SerializedName("EUR")
    val eUR: Double? = null,
    @SerializedName("FJD")
    val fJD: Double? = null,
    @SerializedName("FKP")
    val fKP: Double? = null,
    @SerializedName("FOK")
    val fOK: Double? = null,
    @SerializedName("GBP")
    val gBP: Double? = null,
    @SerializedName("GEL")
    val gEL: Double? = null,
    @SerializedName("GGP")
    val gGP: Double? = null,
    @SerializedName("GHS")
    val gHS: Double? = null,
    @SerializedName("GIP")
    val gIP: Double? = null,
    @SerializedName("GMD")
    val gMD: Double? = null,
    @SerializedName("GNF")
    val gNF: Double? = null,
    @SerializedName("GTQ")
    val gTQ: Double? = null,
    @SerializedName("GYD")
    val gYD: Double? = null,
    @SerializedName("HKD")
    val hKD: Double? = null,
    @SerializedName("HNL")
    val hNL: Double? = null,
    @SerializedName("HRK")
    val hRK: Double? = null,
    @SerializedName("HTG")
    val hTG: Double? = null,
    @SerializedName("HUF")
    val hUF: Double? = null,
    @SerializedName("IDR")
    val iDR: Double? = null,
    @SerializedName("ILS")
    val iLS: Double? = null,
    @SerializedName("IMP")
    val iMP: Double? = null,
    @SerializedName("INR")
    val iNR: Double? = null,
    @SerializedName("IQD")
    val iQD: Double? = null,
    @SerializedName("IRR")
    val iRR: Double? = null,
    @SerializedName("ISK")
    val iSK: Double? = null,
    @SerializedName("JEP")
    val jEP: Double? = null,
    @SerializedName("JMD")
    val jMD: Double? = null,
    @SerializedName("JOD")
    val jOD: Double? = null,
    @SerializedName("JPY")
    val jPY: Double? = null,
    @SerializedName("KES")
    val kES: Double? = null,
    @SerializedName("KGS")
    val kGS: Double? = null,
    @SerializedName("KHR")
    val kHR: Double? = null,
    @SerializedName("KID")
    val kID: Double? = null,
    @SerializedName("KMF")
    val kMF: Double? = null,
    @SerializedName("KRW")
    val kRW: Double? = null,
    @SerializedName("KWD")
    val kWD: Double? = null,
    @SerializedName("KYD")
    val kYD: Double? = null,
    @SerializedName("KZT")
    val kZT: Double? = null,
    @SerializedName("LAK")
    val lAK: Double? = null,
    @SerializedName("LBP")
    val lBP: Double? = null,
    @SerializedName("LKR")
    val lKR: Double? = null,
    @SerializedName("LRD")
    val lRD: Double? = null,
    @SerializedName("LSL")
    val lSL: Double? = null,
    @SerializedName("LYD")
    val lYD: Double? = null,
    @SerializedName("MAD")
    val mAD: Double? = null,
    @SerializedName("MDL")
    val mDL: Double? = null,
    @SerializedName("MGA")
    val mGA: Double? = null,
    @SerializedName("MKD")
    val mKD: Double? = null,
    @SerializedName("MMK")
    val mMK: Double? = null,
    @SerializedName("MNT")
    val mNT: Double? = null,
    @SerializedName("MOP")
    val mOP: Double? = null,
    @SerializedName("MRU")
    val mRU: Double? = null,
    @SerializedName("MUR")
    val mUR: Double? = null,
    @SerializedName("MVR")
    val mVR: Double? = null,
    @SerializedName("MWK")
    val mWK: Double? = null,
    @SerializedName("MXN")
    val mXN: Double? = null,
    @SerializedName("MYR")
    val mYR: Double? = null,
    @SerializedName("MZN")
    val mZN: Double? = null,
    @SerializedName("NAD")
    val nAD: Double? = null,
    @SerializedName("NGN")
    val nGN: Double? = null,
    @SerializedName("NIO")
    val nIO: Double? = null,
    @SerializedName("NOK")
    val nOK: Double? = null,
    @SerializedName("NPR")
    val nPR: Double? = null,
    @SerializedName("NZD")
    val nZD: Double? = null,
    @SerializedName("OMR")
    val oMR: Double? = null,
    @SerializedName("PAB")
    val pAB: Double? = null,
    @SerializedName("PEN")
    val pEN: Double? = null,
    @SerializedName("PGK")
    val pGK: Double? = null,
    @SerializedName("PHP")
    val pHP: Double? = null,
    @SerializedName("PKR")
    val pKR: Double? = null,
    @SerializedName("PLN")
    val pLN: Double? = null,
    @SerializedName("PYG")
    val pYG: Double? = null,
    @SerializedName("QAR")
    val qAR: Double? = null,
    @SerializedName("RON")
    val rON: Double? = null,
    @SerializedName("RSD")
    val rSD: Double? = null,
    @SerializedName("RUB")
    val rUB: Double? = null,
    @SerializedName("RWF")
    val rWF: Double? = null,
    @SerializedName("SAR")
    val sAR: Double? = null,
    @SerializedName("SBD")
    val sBD: Double? = null,
    @SerializedName("SCR")
    val sCR: Double? = null,
    @SerializedName("SDG")
    val sDG: Double? = null,
    @SerializedName("SEK")
    val sEK: Double? = null,
    @SerializedName("SGD")
    val sGD: Double? = null,
    @SerializedName("SHP")
    val sHP: Double? = null,
    @SerializedName("SLE")
    val sLE: Double? = null,
    @SerializedName("SLL")
    val sLL: Double? = null,
    @SerializedName("SOS")
    val sOS: Double? = null,
    @SerializedName("SRD")
    val sRD: Double? = null,
    @SerializedName("SSP")
    val sSP: Double? = null,
    @SerializedName("STN")
    val sTN: Double? = null,
    @SerializedName("SYP")
    val sYP: Double? = null,
    @SerializedName("SZL")
    val sZL: Double? = null,
    @SerializedName("THB")
    val tHB: Double? = null,
    @SerializedName("TJS")
    val tJS: Double? = null,
    @SerializedName("TMT")
    val tMT: Double? = null,
    @SerializedName("TND")
    val tND: Double? = null,
    @SerializedName("TOP")
    val tOP: Double? = null,
    @SerializedName("TRY")
    val tRY: Double? = null,
    @SerializedName("TTD")
    val tTD: Double? = null,
    @SerializedName("TVD")
    val tVD: Double? = null,
    @SerializedName("TWD")
    val tWD: Double? = null,
    @SerializedName("TZS")
    val tZS: Double? = null,
    @SerializedName("UAH")
    val uAH: Double? = null,
    @SerializedName("UGX")
    val uGX: Double? = null,
    @SerializedName("UYU")
    val uYU: Double? = null,
    @SerializedName("UZS")
    val uZS: Double? = null,
    @SerializedName("VES")
    val vES: Double? = null,
    @SerializedName("VND")
    val vND: Double? = null,
    @SerializedName("VUV")
    val vUV: Double? = null,
    @SerializedName("WST")
    val wST: Double? = null,
    @SerializedName("XAF")
    val xAF: Double? = null,
    @SerializedName("XCD")
    val xCD: Double? = null,
    @SerializedName("XDR")
    val xDR: Double? = null,
    @SerializedName("XOF")
    val xOF: Double? = null,
    @SerializedName("XPF")
    val xPF: Double? = null,
    @SerializedName("YER")
    val yER: Double? = null,
    @SerializedName("ZAR")
    val zAR: Double? = null,
    @SerializedName("ZMW")
    val zMW: Double? = null,
    @SerializedName("ZWL")
    val zWL: Double? = null
)

