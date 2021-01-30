package com.aslnstbk.tazaaua.di

import com.aslnstbk.tazaaua.common.AirQualityManager
import com.aslnstbk.tazaaua.common.WeatherManager
import com.aslnstbk.tazaaua.common.data.RetrofitClient
import com.aslnstbk.tazaaua.navigation.Navigation
import org.koin.dsl.module

val applicationModule = module {

    single {
        RetrofitClient.instance
    }

    single {
        Navigation()
    }

    factory {
        AirQualityManager()
    }

    factory {
        WeatherManager()
    }
}