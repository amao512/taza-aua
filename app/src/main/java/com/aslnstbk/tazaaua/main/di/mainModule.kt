package com.aslnstbk.tazaaua.main.di

import com.aslnstbk.tazaaua.main.MainRouter
import org.koin.dsl.module

val mainModule = module {

    single {
        MainRouter()
    }
}