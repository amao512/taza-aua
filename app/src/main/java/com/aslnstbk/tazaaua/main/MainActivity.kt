package com.aslnstbk.tazaaua.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aslnstbk.tazaaua.R
import com.aslnstbk.tazaaua.home.presentation.HomeFragment
import com.aslnstbk.tazaaua.navigation.Navigation
import org.koin.android.ext.android.inject

lateinit var APP_ACTIVITY: MainActivity

class MainActivity : AppCompatActivity() {

    private val navigation: Navigation by inject()
    private val mainRouter: MainRouter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        APP_ACTIVITY = this
        setFragment()
    }

    private fun setFragment() {
        navigation.navigate(
            mainRouter.setScreen(
                fragment = HomeFragment(),
                isBackStack = false
            )
        )
    }
}