package com.aslnstbk.tazaaua.home.domain

import com.aslnstbk.tazaaua.common.data.models.StatusData

interface HomeRepository {

    fun getCity(
        country: String,
        state: String,
        city: String,
        result: (StatusData) -> Unit,
        fail: (String) -> Unit
    )
}