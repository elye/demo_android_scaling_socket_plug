package com.elyeproj.team_a

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.elyeproj.design_kit.ListSocket
import com.elyeproj.design_kit.TabSocket
import com.elyeproj.team_a.ui.theme.ThemeATheme

class ATeamActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemeATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Spacer(modifier = Modifier.padding(innerPadding))
                        Text("This is Team A Calling Tab Socket!!")
                        TabSocket(
                            listOf(
                                "TeamAPlug1" to "SocketList to A1",
                                "TeamAPlug2" to "SocketList to A2",
                                "TeamBPlug" to "SocketList to B",
                                "TeamCPlug" to "SocketList to C",
                            )
                        )

                        Text("This is Team A Calling Socket!!")
                        ListSocket(
                            listOf(
                                "TeamBPlug" to "SocketList to B",
                                "TeamAPlug" to "SocketList to A",
                                "TeamBPlug" to "Another one to B",
                                "TeamCPlug" to "SocketList to C",
                                "TeamAPlug" to "Another one to A",
                            )
                        )
                    }
                }
            }
        }
    }
}