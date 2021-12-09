package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_read_text.setOnClickListener {
            CameraActivity.start(this)
        }

        btn_detect_face.setOnClickListener {
            CameraActivity.start(this)
        }
    }
}
