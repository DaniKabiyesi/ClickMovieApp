package com.example.myapplication.feature.sign_up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentSignUpScreenBinding

class SignUpScreenFragment : Fragment() {

    private lateinit var _binding: FragmentSignUpScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSignUpScreenBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

}