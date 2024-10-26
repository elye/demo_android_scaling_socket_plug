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

