package com.aslnstbk.tazaaua.main

import androidx.fragment.app.Fragment
import com.aslnstbk.tazaaua.R
import com.aslnstbk.tazaaua.navigation.Router

class MainRouter: Router {

    override var containerId: Int = R.id.activity_main_fragment_container
    override lateinit var fragment: Fragment
    override var isBackStack: Boolean = true

    override fun setScreen(
        fragment: Fragment,
        isBackStack: Boolean
    ): Router {
        super.setScreen(fragment, isBackStack)

        return this
    }
}