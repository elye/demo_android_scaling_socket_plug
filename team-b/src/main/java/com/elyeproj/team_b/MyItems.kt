package com.elyeproj.team_b

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elyeproj.design_kit.ListPlugItem
import com.elyeproj.design_kit.socketListView


fun registerViewB() {
    val a = @Composable { data: String -> TeamBView(data = data) }
    socketListView.register(a)
}

@Composable
fun TeamBView(data: String) {
    ListPlugItem {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFF7DCEA0))
        ) {
            Text("Team B Here")
            Text("From OutSide: $data Data")
        }
    }
}

