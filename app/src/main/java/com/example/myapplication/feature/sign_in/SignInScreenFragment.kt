package com.example.myapplication.feature.sign_in

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSignInScreenBinding

class SignInScreenFragment : Fragment() {

    private lateinit var _binding: FragmentSignInScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSignInScreenBinding.inflate(
            inflater,
            container,
            false
        )
        setListeners()

        return binding.root
    }

    private fun setListeners() {
        binding.apply {
            signInButton.setOnClickListener {
                nextScreen(Screen.HOME_SCREEN)
            }

            signUpButton.setOnClickListener {
                nextScreen(Screen.SIGN_UP_SCREEN)
            }
        }
    }

    private fun nextScreen(screen: Screen) {
        when (screen) {
            Screen.HOME_SCREEN -> findNavController().navigate(R.id.action_signInFragment_to_homeScreenFragment)

            Screen.SIGN_UP_SCREEN -> findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }

}

enum class Screen {
    HOME_SCREEN,
    SIGN_UP_SCREEN
}