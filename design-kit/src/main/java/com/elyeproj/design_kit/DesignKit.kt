package com.elyeproj.design_kit

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable

val teamViewRegistration = TeamViewRegistration()


class TeamViewRegistration {
    private val listOfListItemPlugViews = mutableMapOf<String, @Composable (String) -> Unit>()

    private val listOfTabScreenPlugViews = mutableMapOf<String, Pair<String, @Composable (String) -> Unit>>()

    fun getListItemPlugView(key: String, data: String): @Composable LazyItemScope.() -> Unit = {
        listOfListItemPlugViews[key]?.invoke(data) ?: DefaultErrorListItemPlug()
    }

    fun registerListItemPlugViews(key: String, function: @Composable (String) -> Unit) {
        listOfListItemPlugViews[key] = function
    }

    fun getTabScreenPlugView(key: String, data: String): @Composable () -> Unit = {
        listOfTabScreenPlugViews[key]?.second?.invoke(data) ?: DefaultErrorTabScreenPlug()
    }

    fun getTabScreenPlugTitle(key: String): String {
        return listOfTabScreenPlugViews[key]?.first ?: "MISSING TITLE"
    }

    fun registerTabScreenPlugViews(key: String, pairNameFunction: Pair<String, @Composable (String) -> Unit>) {
        listOfTabScreenPlugViews[key] = pairNameFunction
    }

}

