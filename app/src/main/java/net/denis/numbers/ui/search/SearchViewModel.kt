package net.denis.numbers.ui.search

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.denis.numbers.domain.usecase.GetFactUseCase
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getFactUseCase: GetFactUseCase
): ViewModel() {



}