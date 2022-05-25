package com.example.myapplication.feature.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFirstScreenOnboardingBinding
import com.example.myapplication.databinding.FragmentSecondScreenOnboardingBinding

class FirstScreenOnboardingFragment : Fragment() {

    private lateinit var _binding: FragmentSecondScreenOnboardingBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSecondScreenOnboardingBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

}