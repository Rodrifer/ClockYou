package com.bnyro.clock.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object Preferences {
    lateinit var instance: SharedPreferences

    const val showSecondsKey = "showSeconds"
    const val themeKey = "theme"

    fun init(context: Context) {
        instance = context.getSharedPreferences("clock_you", Context.MODE_PRIVATE)
    }

    fun edit(action: SharedPreferences.Editor.() -> Unit) = instance.edit(true, action)
}
