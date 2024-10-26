package com.elyeproj.team_b

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.elyeproj.design_kit.socketListView


fun registerViewB() {
    val a = @Composable { data: String -> TeamBView(data = data) }
    socketListView.register(a)
}

@Composable
fun TeamBView(data: String) {
    Column {
        Text("This is what I try")
        Text("Team B: $data")
    }
}

