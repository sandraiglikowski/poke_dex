package com.sandra.pokedex.util

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.sandra.pokedex.R

//
fun FragmentActivity.replaceView(
    fragment: Fragment, @IdRes containerId: Int = R.id.main_container
) {
    val manager: FragmentManager = supportFragmentManager
    val transaction: FragmentTransaction = manager.beginTransaction()

    transaction.run {
        replace(containerId, fragment)
        addToBackStack("")
        commit()
    }
    //essa extensão aponta pra xml(caixa)
    //cada xml tem uma classe.kt mas eles são alocados em outro lugar
}