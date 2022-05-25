package com.example.myapplication.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentHomeScreenBinding

class HomeScreenFragment : Fragment() {

    private lateinit var _binding: FragmentHomeScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeScreenBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }
}