package com.elyeproj.design_kit

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor

class DesignKit {
}

val socketListView = SocketListView()



class SocketListView {
    lateinit var a: @Composable (String) -> Unit

    fun getItemFirst(data: String):  @Composable LazyItemScope.() -> Unit = {
        a.invoke(data)
    }

    fun register(function: @Composable (String) -> Unit) {
        a = function
    }
}

@Composable
fun SocketList(innerPadding: PaddingValues) {
    LazyColumn(Modifier.padding(innerPadding)) {
        item {
            socketListView.getItemFirst(data = "From SocketList").invoke(this)
        }
    }
}


@Composable
fun ListPlugItem(content: @Composable () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(20.dp))
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(BorderStroke(2.dp, SolidColor(Color.Red)))) {
        Text("Template from Plug")
        content.invoke()
    }
}


