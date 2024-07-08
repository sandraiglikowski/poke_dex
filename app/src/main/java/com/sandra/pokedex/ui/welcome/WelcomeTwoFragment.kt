package com.sandra.pokedex.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sandra.pokedex.R
import com.sandra.pokedex.databinding.WelcomeScreenTwoFragmentBinding

class WelcomeTwoFragment : Fragment(R.layout.welcome_screen_two_fragment) {
    private lateinit var binding: WelcomeScreenTwoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.welcome_screen_two_fragment,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}