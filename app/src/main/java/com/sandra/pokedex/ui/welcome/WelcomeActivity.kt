package com.sandra.pokedex.ui.welcome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sandra.pokedex.R
import com.sandra.pokedex.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        binding.lifecycleOwner = this
        if (savedInstanceState == null) {
            replaceFragment(WelcomeOneFragment())
        }
    }

    fun replaceFragment(fragment: Fragment) {
        if (supportFragmentManager.isStateSaved.not()) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, fragment)
                .commit()
        }
    }
}
//ontem já foi, hj ñ acaba e amanhã ñ chega
