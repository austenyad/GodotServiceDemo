package com.yad.godotservicedemo

import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import org.godotengine.godot.service.RemoteGodotFragment

class HostGameActivity: AppCompatActivity() {
    private var remoteGodotFragment: RemoteGodotFragment? = null
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)



        // 获取或创建 RemoteGodotFragment
        val existing = supportFragmentManager.findFragmentById(R.id.godot_fragment_container)
        if (existing is RemoteGodotFragment) {
            remoteGodotFragment = existing
        } else {
            remoteGodotFragment = RemoteGodotFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.godot_fragment_container, remoteGodotFragment!!)
                .commitNowAllowingStateLoss()
        }

        // 启动按钮 — 绑定 GodotService 并启动引擎
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            remoteGodotFragment?.startRemoteGame(arrayOf())
        }

        // 停止按钮 — 停止并销毁引擎
        findViewById<Button>(R.id.btn_stop).setOnClickListener {
            remoteGodotFragment?.stopRemoteGame()
        }
    }

}