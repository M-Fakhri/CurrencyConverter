package com.spread.currencyconverter.ui.states

data class MainState<out T>(
    val progress: Boolean = false,
    val status: Status = Status.Idle,
    val data: T? = null,
    val message: String = ""
) {
    fun empty() = MainState<T>()
    fun showProgress() = copy(progress = true)
    fun failureWith(message: String) =
        copy(progress = false, status = Status.Failure, message = message)

    fun successWith(data: Any? = null, message: String = "") =
        copy(progress = false, status = Status.Success, data = data as T,message=message)
}

enum class Status {
    Idle,
    Success,
    Failure
}