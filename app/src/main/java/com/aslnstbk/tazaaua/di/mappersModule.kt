package com.aslnstbk.tazaaua.di

import com.aslnstbk.tazaaua.utils.mappers.*
import org.koin.dsl.module

val mappersModule = module {

    factory {
        ResponseApiDataMapper(
            cityApiDataMapper = get()
        )
    }

    factory {
        CityApiDataMapper(
            currentApiDataMapper = get()
        )
    }

    factory {
        CurrentApiDataMapper(
            weatherApiDataMapper = get(),
            pollutionApiDataMapper = get()
        )
    }

    factory {
        WeatherApiDataMapper()
    }

    factory {
        PollutionApiDataMapper()
    }
}