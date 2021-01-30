package com.aslnstbk.tazaaua

import android.app.Application
import com.aslnstbk.tazaaua.di.applicationModule
import com.aslnstbk.tazaaua.di.mappersModule
import com.aslnstbk.tazaaua.home.di.homeModule
import com.aslnstbk.tazaaua.main.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TazaAuaApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TazaAuaApp)

            modules(
                applicationModule,
                mappersModule,
                mainModule,
                homeModule
            )
        }
    }
}