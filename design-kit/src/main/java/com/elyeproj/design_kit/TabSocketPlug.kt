package com.elyeproj.design_kit

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp

@Composable
fun TabSocket(contents: List<Pair<String, String>>) {
    var tabIndex by remember { mutableIntStateOf(0) }

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            contents.forEachIndexed { index, content ->
                Tab(text = { Text(teamViewRegistration.getTabScreenPlugTitle(content.first)) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        teamViewRegistration.getTabScreenPlugView(
            contents[tabIndex].first,
            contents[tabIndex].second).invoke()
    }
}

@Composable
fun TabScreenPlug(content: @Composable () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .border(BorderStroke(2.dp, SolidColor(Color.Red)))
    ) {
        Text("Template from Tab Screen Plug")
        content.invoke()
    }
}

@Composable
fun DefaultErrorTabScreenPlug() {
    TabScreenPlug {
        Box(modifier = Modifier.fillMaxSize().background(Color.Red), contentAlignment = Alignment.Center) {
            Text("ERROR TAB SCREEN PLUG!!")
        }
    }
}