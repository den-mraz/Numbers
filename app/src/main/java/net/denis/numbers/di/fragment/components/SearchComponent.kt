package net.denis.numbers.di.fragment.components

import android.content.Context
import androidx.fragment.app.Fragment
import net.denis.numbers.di.fragment.FragmentModule
import net.denis.numbers.ui.search.SearchFragment

open class SearchComponent: Fragment() {

    lateinit var fragmentModule: FragmentModule

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentModule.injectSearchFragment(this as SearchFragment)
    }
}