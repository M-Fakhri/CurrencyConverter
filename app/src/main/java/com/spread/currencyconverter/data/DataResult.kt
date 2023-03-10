package com.spread.currencyconverter.data

sealed class DataResult<out R> {
    data class Success<out T>(val data: T) : DataResult<T>()
    data class Error(val message: String) : DataResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[Message=$message]"
        }
    }
}

suspend fun <T> DataResult<T?>.onSuccess(action: suspend (data: T?) -> Unit): DataResult<T?> {
    if (this is DataResult.Success) {
        action(this.data)
    }
    return this
}

suspend fun <T> DataResult<T?>.onError(action: suspend (error: String) -> Unit): DataResult<T?> {
    var errorMsg = ""
    if (this is DataResult.Error) {
        errorMsg = this.message
    }
    if (errorMsg.isNotEmpty())
        action(errorMsg)
    return this
}
