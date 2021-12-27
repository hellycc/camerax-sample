package com.castro.helena.camerax_sample.presentation.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.castro.helena.camerax_sample.R

const val IS_FRONT_CAMERA = "isFrontCamera"

class HomeFragment : Fragment(R.layout.fragment_home) {

    var isFrontCamera: Boolean? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.run {
            findViewById<Button>(R.id.btn_read_text).setOnClickListener {
                isFrontCamera = false
                val bundle = bundleOf(IS_FRONT_CAMERA to isFrontCamera)
                findNavController().navigate(R.id.action_homeFragment_to_cameraFragment, bundle)
            }
            findViewById<Button>(R.id.btn_detect_face).setOnClickListener {
                isFrontCamera = true
                val bundle = bundleOf(IS_FRONT_CAMERA to isFrontCamera)
                findNavController().navigate(R.id.action_homeFragment_to_cameraFragment, bundle)
            }
        }
    }

}
