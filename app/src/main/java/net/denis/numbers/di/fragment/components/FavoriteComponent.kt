package net.denis.numbers.di.fragment.components

import android.content.Context
import androidx.fragment.app.Fragment
import net.denis.numbers.di.fragment.FragmentModule
import net.denis.numbers.ui.favorite.FavoriteFragment

open class FavoriteComponent : Fragment() {

    lateinit var fragmentModule: FragmentModule

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentModule.injectFavoriteFragment(this as FavoriteFragment)
    }

}