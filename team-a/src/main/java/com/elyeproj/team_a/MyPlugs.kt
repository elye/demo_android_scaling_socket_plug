package com.elyeproj.team_a

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

fun registerTeamA() {
    val listItemFunction = @Composable { data: String -> TeamAListItemPlugView(data = data) }
    val tabScreenFunction1 = @Composable { data: String -> TeamATabScreenPlugViewOne(data = data) }
    val tabScreenFunction2 = @Composable { data: String -> TeamATabScreenPlugViewTwo(data = data) }
    teamViewRegistration.registerListItemPlugViews("TeamAPlug", listItemFunction)
    teamViewRegistration.registerTabScreenPlugViews(
        "TeamAPlug1",
        Pair("Team A Tab1", tabScreenFunction1)
    )
    teamViewRegistration.registerTabScreenPlugViews(
        "TeamAPlug2",
        Pair("Team A Tab2", tabScreenFunction2)
    )
}

@Composable
fun TeamAListItemPlugView(data: String) {
    ListItemPlug {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFFADCE70))
        ) {
            Text("Team A ListItem Here")
            Text("From OutSide: $data Data")
        }
    }
}

@Composable
fun TeamATabScreenPlugViewOne(data: String) {
    TabScreenPlug {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFADCE70)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color(0xFFADCE70))
            ) {
                Text("First Team A Tab Screen Here")
                Text("From OutSide: $data Data")
            }
        }
    }
}

@Composable
fun TeamATabScreenPlugViewTwo(data: String) {
    TabScreenPlug {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFF7DCEF0)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color(0xFF7DCEF0))
            ) {
                Text("Second Team A Tab Screen Here")
                Text("From OutSide: $data Data")
            }
        }
    }
}
