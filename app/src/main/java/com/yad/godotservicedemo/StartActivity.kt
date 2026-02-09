package com.yad.godotservicedemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        findViewById<Button>(R.id.btn_open_main).setOnClickListener {
            startActivity(Intent(this, HostGameActivity::class.java))
        }
    }
}
