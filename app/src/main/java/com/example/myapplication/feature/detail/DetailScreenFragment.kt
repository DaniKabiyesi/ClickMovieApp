package com.example.myapplication.feature.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentDetailScreenBinding

class DetailScreenFragment : Fragment() {

    private lateinit var _binding: FragmentDetailScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDetailScreenBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }


}