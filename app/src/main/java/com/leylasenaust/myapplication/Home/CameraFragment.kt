package com.leylasenaust.myapplication.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leylasenaust.myapplication.R

   class CameraFragment : Fragment(){

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            var view= inflater.inflate(R.layout.fragment_camera, container, false)
            return super.onCreateView(inflater, container, savedInstanceState)
        }
    }
