package com.castro.helena.camerax_sample.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.castro.helena.camerax_sample.R
import com.castro.helena.camerax_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setViews()
    }

    private fun setViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.home_fragment_container_view) as NavHostFragment
        navHostFragment.navController
    }

}
