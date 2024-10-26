package com.elyeproj.team_a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.elyeproj.design_kit.SocketList
import com.elyeproj.team_a.ui.theme.ThemeATheme

class ATeamActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemeATheme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SocketList(innerPadding)
                }
            }
        }
    }
}