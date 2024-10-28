package com.elyeproj.socketandplug

import android.app.Application
import com.elyeproj.team_a.registerTeamA
import com.elyeproj.team_b.registerTeamB
import com.elyeproj.team_c.registerTeamC

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        registerTeams()
    }

    private fun registerTeams() {
        registerTeamA()
        registerTeamB()
        registerTeamC()
    }
}
