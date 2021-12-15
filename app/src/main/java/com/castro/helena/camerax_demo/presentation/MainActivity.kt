package com.castro.helena.camerax_demo.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.castro.helena.camerax_demo.databinding.ActivityMainBinding

private const val PACKAGE_NAME = "com.castro.helena.feature_cameraX"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnReadText.setOnClickListener {
//            launchActivity("com.castro.helena.feature_cameraX.presentation.CameraActivity")
        }

        binding.btnDetectFace.setOnClickListener {
//            launchActivity("com.castro.helena.feature_cameraX.presentation.CameraActivity")
        }
    }

    private fun launchActivity(className: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setClassName(PACKAGE_NAME, className)
            startActivity(intent)
        } catch (notFound: ClassNotFoundException) {
            notFound.stackTrace
        }
    }

}
