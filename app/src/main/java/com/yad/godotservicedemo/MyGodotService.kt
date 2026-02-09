package com.yad.godotservicedemo

import android.widget.Toast
import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin
import org.godotengine.godot.plugin.UsedByGodot
import org.godotengine.godot.service.GodotService

class MyGodotService: GodotService() {

    // 这个内部类就是运行在 :godot 进程中的 Plugin
    class ServiceAppPlugin(godot: Godot, private val service: MyGodotService) : GodotPlugin(godot) {

        override fun getPluginName() = "AppPlugin"

        @UsedByGodot
        fun showToast(message: String) {
            // Service 本身就是 Context，可以直接用
            activity?.runOnUiThread {
                Toast.makeText(service, message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}