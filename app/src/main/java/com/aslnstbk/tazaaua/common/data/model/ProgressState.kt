package com.aslnstbk.tazaaua.common.data.model

sealed class ProgressState {

    object Loading : ProgressState()

    object Done : ProgressState()
}