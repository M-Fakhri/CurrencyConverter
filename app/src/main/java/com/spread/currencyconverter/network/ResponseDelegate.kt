package com.spread.currencyconverter.network


import retrofit2.Response

fun <T> responseDelegate(response: Response<T>): NetworkResult<T?> {
    return when
            (response.code()) {
        200 -> {
            NetworkResult.Success(response.body())
        }

        else -> {
            NetworkResult.Failure("Server Error")
        }
    }
}