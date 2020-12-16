package com.deliveryclub.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<Button>(R.id.btn_start)
        val layout = findViewById<MotionLayout>(R.id.motion_layout)

        var isStart = false

        btnStart.setOnClickListener {
            if (!isStart) {
                isStart = true
                layout.transitionToEnd()
            } else {
                isStart = false
                layout.transitionToStart()
            }
        }
    }
}