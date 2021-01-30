package com.aslnstbk.tazaaua.common.data.models

data class WeatherData(
    val ts: String,
    val tp: Int,
    val pr: Int,
    val hu: Int,
    val ws: Int,
    val wd: Int,
    val ic: String
)