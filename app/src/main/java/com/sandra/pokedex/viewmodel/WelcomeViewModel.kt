package com.sandra.pokedex.viewmodel

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.sandra.pokedex.ui.welcome.WelcomeActivity

class WelcomeViewModel : ViewModel() {
    fun onSwitchFragment(activity: WelcomeActivity, fragment: Fragment) {
        activity.replaceFragment(fragment)
    }
}