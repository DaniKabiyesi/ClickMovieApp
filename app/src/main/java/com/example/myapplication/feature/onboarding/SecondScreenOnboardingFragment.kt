package com.example.myapplication.feature.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSecondScreenOnboardingBinding

class SecondScreenOnboardingFragment : Fragment() {

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
        setListeners()

        return binding.root
    }

    private fun setListeners() {
        binding.apply {
            nextScreenButton.setOnClickListener {
                nextScreen()
            }
        }
    }

    private fun nextScreen() {
        findNavController().navigate(R.id.action_secondScreenOnboardingFragment_to_thirdScreenOnboardingFragment)
    }

}