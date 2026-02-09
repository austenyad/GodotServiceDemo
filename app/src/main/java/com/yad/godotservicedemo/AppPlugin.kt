package com.yad.godotservicedemo

import android.util.Log
import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin
import org.godotengine.godot.plugin.UsedByGodot

class AppPlugin(godot: Godot) : GodotPlugin(godot) {

    override fun getPluginName() = "AppPlugin"

    @UsedByGodot
    fun showToast(message: String) {
        Log.e("AppPlugin", "-----> $message")
    }
}