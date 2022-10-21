package net.denis.numbers.ui.search

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.denis.numbers.domain.usecase.GetFactUseCase
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getFactUseCase: GetFactUseCase
) : ViewModel() {

    val numberList: MutableLiveData<String> = MutableLiveData()

    fun getNumberFromVm(number: Int, type: String) {
            viewModelScope.launch {
                numberList.value = getFactUseCase(number, type)?: "Check internet connection"
            }
    }

}
