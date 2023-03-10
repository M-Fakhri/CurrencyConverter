package com.spread.currencyconverter.network

import com.spread.currencyconverter.data.DataResult

sealed class NetworkResult<out R> {
    data class Success<out T>(val data: T) : NetworkResult<T>()
    data class Error<out E>(val error: E) : NetworkResult<E>()
    data class Failure(val message: String) : NetworkResult<Nothing>()


    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[Error=$error]"
            is Failure -> "Error[Message=$message]"
        }
    }
}


suspend fun <T> NetworkResult<T?>.onSuccess(action: suspend (data: T?) -> Unit): NetworkResult<T?> {
    if (this is NetworkResult.Success) {
        action(this.data)
    }
    return this
}

suspend fun <T> NetworkResult<T?>.onError(action: suspend (error: String) -> Unit): NetworkResult<T?> {
    var errorMsg = ""
    if (this is NetworkResult.Failure) {
        errorMsg = this.message
    } else if (this is NetworkResult.Error) {
        errorMsg = this.error.toString()
    }
    if (errorMsg.isNotEmpty())
        action(errorMsg)
    return this
}