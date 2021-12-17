package com.castro.helena.camerax_demo.presentation.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.castro.helena.camerax_demo.R

class HomeFragment : Fragment(R.layout.fragment_home), HomeContract.View {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btn_read_text).setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_cameraFragment)
            }
            findViewById<Button>(R.id.btn_detect_face).setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_cameraFragment)
            }
        }
    }

}
