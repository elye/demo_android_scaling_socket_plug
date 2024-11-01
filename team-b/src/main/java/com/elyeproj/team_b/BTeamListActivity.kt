package com.elyeproj.team_b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.elyeproj.design_kit.ListSocket
import com.elyeproj.design_kit.ui.theme.DesignKitTheme

class BTeamListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DesignKitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Spacer(modifier = Modifier.padding(innerPadding))
                        ListSocketCalling()
                    }
                }
            }
        }
    }
}

@Composable
fun ListSocketCalling() {
    Text("This is Team B Calling Socket!!")
    ListSocket(
        listOf(
            "TeamAPlug" to "SocketList to A",
            "TeamBPlug1" to "Another one to B",
            "TeamCPlug" to "SocketList to C",
            "TeamDPlug" to "Another one to D",
            "TeamAPlug" to "Another one to A",
            "TeamBPlug2" to "SocketList to B",
            "TeamBPlug1" to "Another one to B",
            "TeamAPlug" to "SocketList to A",
            "TeamBPlug1" to "Another one to B",
            "TeamCPlug" to "SocketList to C",
            "TeamBPlug2" to "Another one to B",
        )
    )
}