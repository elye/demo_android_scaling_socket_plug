package com.elyeproj.socketandplug

import android.app.Application
import com.elyeproj.team_b.registerViewB

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        registerViewB()
    }
}
