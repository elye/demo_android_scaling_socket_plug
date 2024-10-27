package com.elyeproj.socketandplug

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.elyeproj.design_kit.ui.theme.DesignKitTheme
import com.elyeproj.team_a.ATeamTabActivity
import com.elyeproj.team_b.BTeamListActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            DesignKitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column {
                            Button(onClick = { context.startActivity(Intent(context, ATeamTabActivity::class.java)) }) {
                                Text(text = "Team A Tab Activity")
                            }
                            Spacer(Modifier.padding(16.dp))
                            Button(onClick = { context.startActivity(Intent(context, BTeamListActivity::class.java)) }) {
                                Text(text = "Team B List Activity")
                            }
                        }
                    }
                }
            }
        }
    }
}
