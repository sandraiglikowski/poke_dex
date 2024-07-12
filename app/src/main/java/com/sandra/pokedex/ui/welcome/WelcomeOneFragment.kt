package com.sandra.pokedex.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sandra.pokedex.R
import com.sandra.pokedex.databinding.WelcomeScreenOneFragmentBinding
import com.sandra.pokedex.util.replaceView
import com.sandra.pokedex.viewmodel.welcome.WelcomeViewModel

class WelcomeOneFragment : Fragment(R.layout.welcome_screen_one_fragment) {
    private lateinit var binding: WelcomeScreenOneFragmentBinding
    private lateinit var viewModel: WelcomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.welcome_screen_one_fragment,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        viewModel = ViewModelProvider(requireActivity()).get(WelcomeViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtons()
    }

    private fun setupButtons() {
        binding.mtbWelcomeOneContinue.setOnClickListener {
            activity?.replaceView(WelcomeTwoFragment.newInstace())
        }
    }
}