package com.sandra.pokedex.ui.welcome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sandra.pokedex.R
import com.sandra.pokedex.databinding.ActivityWelcomeBinding
import com.sandra.pokedex.util.replaceView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        binding.lifecycleOwner = this
        if (savedInstanceState == null) {
            this.replaceView(WelcomeOneFragment())
        }
    }
}
//ontem já foi, hj ñ acaba e amanhã ñ chega
//eu quero o atalho pra comenta mas deu aquele negocio