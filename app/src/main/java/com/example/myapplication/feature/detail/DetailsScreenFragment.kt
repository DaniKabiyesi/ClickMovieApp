package com.example.myapplication.feature.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentDetailsScreenBinding

class DetailsScreenFragment : Fragment() {

    private lateinit var _binding: FragmentDetailsScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDetailsScreenBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }


}