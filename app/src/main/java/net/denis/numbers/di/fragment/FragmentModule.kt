package net.denis.numbers.di.fragment

import dagger.Subcomponent
import net.denis.numbers.ui.favorite.FavoriteFragment
import net.denis.numbers.ui.search.SearchFragment

@Subcomponent
interface FragmentModule {

    fun injectSearchFragment(fragment: SearchFragment)
    fun injectFavoriteFragment(fragment: FavoriteFragment)

}