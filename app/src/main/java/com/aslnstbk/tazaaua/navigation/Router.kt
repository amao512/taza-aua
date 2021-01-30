package com.aslnstbk.tazaaua.navigation

import androidx.fragment.app.Fragment

interface Router {

    val containerId: Int
    var fragment: Fragment
    var isBackStack: Boolean

    fun setScreen(
        fragment: Fragment,
        isBackStack: Boolean = true
    ): Router {
        this.fragment = fragment
        this.isBackStack = isBackStack

        return this
    }
}