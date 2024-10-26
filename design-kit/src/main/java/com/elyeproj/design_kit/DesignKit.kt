package com.elyeproj.design_kit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

class DesignKit {
}

val socketListView = SocketListView()

class SocketListView {
    fun getItemFirst(data: String):  @Composable LazyItemScope.() -> Unit = {
        MyItem { Text(text = "data") }
    }
}

@Composable
fun SocketList(innerPadding: PaddingValues) {
    LazyColumn(Modifier.padding(innerPadding)) {
        item {
            socketListView.getItemFirst(data = "").invoke(this)
        }
    }
}

@Composable
private fun MyItem(content: @Composable () -> Unit = {}) {
    Column(modifier = androidx.compose.ui.Modifier.padding(16.dp), ) {
        Text("I am here")
        content.invoke()
    }
}

