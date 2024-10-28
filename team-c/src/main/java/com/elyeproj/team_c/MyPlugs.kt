package com.elyeproj.team_c

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elyeproj.design_kit.ListItemPlug
import com.elyeproj.design_kit.TabScreenPlug
import com.elyeproj.design_kit.teamViewRegistration


fun registerTeamC() {
    val listItemFunction = @Composable { data: String -> TeamCListItemPlugView(data = data) }
    val tabScreenFunction = @Composable { data: String -> TeamCTabScreenPlugView(data = data) }

    teamViewRegistration.registerListItemPlugViews("TeamCPlug", listItemFunction)

    teamViewRegistration.registerTabScreenPlugViews(
        "TeamCPlug",
        Pair("Team C Tab", tabScreenFunction)
    )
}

@Composable
fun TeamCListItemPlugView(data: String) {
    ListItemPlug {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFFFD3E80))
        ) {
            Text("Team C List Item Here")
            Text("=========================")
            Text("Here to show: $data Data")
        }
    }
}

@Composable
fun TeamCTabScreenPlugView(data: String) {
    TabScreenPlug {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFFD3E80)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color(0xFFFD3E80))
            ) {
                Text("Team C Tab Screen Here")
                Text("From OutSide: $data Data")
            }
        }
    }
}



