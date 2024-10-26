package com.elyeproj.socketandplug

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.elyeproj.socketandplug.ui.theme.SocketAndPlugTheme
import com.elyeproj.team_a.ATeamActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocketAndPlugTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting("Android", Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Button(onClick = { context.startActivity(Intent(context, ATeamActivity::class.java)) }) {
        Text(text = "Hello $name! To Another Activity", modifier = modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SocketAndPlugTheme {
        Greeting("Android")
    }
}