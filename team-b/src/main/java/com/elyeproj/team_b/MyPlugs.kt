package com.elyeproj.team_b

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


fun registerTeamB() {
    val listItemFunction1 = @Composable { data: String -> TeamBListItemPlugView1(data = data) }
    val listItemFunction2 = @Composable { data: String -> TeamBListItemPlugView2(data = data) }
    val tabScreenFunction = @Composable { data: String -> TeamBTabScreenPlugView(data = data) }
    teamViewRegistration.registerListItemPlugViews("TeamBPlug1", listItemFunction1)
    teamViewRegistration.registerListItemPlugViews("TeamBPlug2", listItemFunction2)

    teamViewRegistration.registerTabScreenPlugViews(
        "TeamBPlug1",
        Pair("Team B Tab", tabScreenFunction)
    )
}

@Composable
fun TeamBListItemPlugView1(data: String) {
    ListItemPlug {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFF7DCEA0))
        ) {
            Text("Team B List Item Here")
            Text("Here to show: $data Data")
            Text("=========================")
        }
    }
}

@Composable
fun TeamBListItemPlugView2(data: String) {
    ListItemPlug {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFF8D3EF0))
        ) {
            Text("Team B List Item Here")
            Text("****** $data Data ******")
        }
    }
}


@Composable
fun TeamBTabScreenPlugView(data: String) {
    TabScreenPlug {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFF7DCEA0)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(Color(0xFF7DCEA0))
            ) {
                Text("Team B Tab Screen Here")
                Text("From OutSide: $data Data")
            }
        }
    }
}

