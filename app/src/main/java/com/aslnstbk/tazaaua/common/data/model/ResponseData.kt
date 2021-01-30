package com.aslnstbk.tazaaua.common.data.model

sealed class ResponseData<out Success, out Error> {

    data class Success<Success>(
        val result: Success
    ) : ResponseData<Success, Nothing>()

    data class Error<Error>(
        val error: Error
    ) : ResponseData<Nothing, Error>()
}