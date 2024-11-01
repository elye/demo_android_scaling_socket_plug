package com.elyeproj.design_kit

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp

@Composable
fun ListSocket(content: List<Pair<String, String>>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .border(BorderStroke(2.dp, SolidColor(Color.Gray)))
    ) {
        Text("This is the Socket List!!")
        LazyColumn(contentPadding = PaddingValues(16.dp)) {
            content.forEach { element ->
                item {
                    teamViewRegistration.getListItemPlugView(element.first, data = element.second).invoke(this)
                }
            }
        }
    }
}

@Composable
fun ListItemPlug(content: @Composable () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .border(BorderStroke(2.dp, SolidColor(Color.Red)))
    ) {
        Text("Template from List Item Plug")
        content.invoke()
    }
}

@Composable
fun DefaultErrorListItemPlug() {
    ListItemPlug {
        Box(modifier = Modifier.fillMaxWidth().background(Color.Red), contentAlignment = Alignment.Center) {
            Text("ERROR LIST ITEM PLUG!!")
        }
    }
}
