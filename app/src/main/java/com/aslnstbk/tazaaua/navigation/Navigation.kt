package com.aslnstbk.tazaaua.navigation

import com.aslnstbk.tazaaua.main.APP_ACTIVITY

class Navigation {

    fun navigate(router: Router){
        if (router.isBackStack){
            APP_ACTIVITY.supportFragmentManager.beginTransaction()
                .replace(router.containerId, router.fragment)
                .addToBackStack(null)
                .commit()
        } else {
            APP_ACTIVITY.supportFragmentManager.beginTransaction()
                .replace(router.containerId, router.fragment)
                .commit()
        }
    }

    fun back(){
        APP_ACTIVITY.supportFragmentManager.popBackStack()
    }

}