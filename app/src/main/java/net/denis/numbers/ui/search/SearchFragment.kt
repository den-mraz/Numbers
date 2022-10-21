package net.denis.numbers.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import net.denis.numbers.R
import net.denis.numbers.databinding.FragmentSearchBinding

@AndroidEntryPoint
class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private val searchViewModel by viewModels<SearchViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.spinnerType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val currentType = adapterView?.getItemAtPosition(position).toString()
                getNumberFact(currentType)
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun getNumberFact(type: String) {
        binding.btnSendNumber.setOnClickListener {
            searchViewModel.getNumberFromVm(validateEtCurrentNumber(), type)
        }
        searchViewModel.numberList.observe(viewLifecycleOwner, Observer { result ->
            binding.tvResultFact.text = result
        })

    }

    private fun validateEtCurrentNumber(): Int {
        val number = binding.etCurrentNumber.text
        if(number.isNotBlank() and number.isDigitsOnly()){
            return binding.etCurrentNumber.text.toString().toInt()
        }else {
            Toast.makeText(requireContext(), R.string.errorMessage, Toast.LENGTH_SHORT).show()
            return 0
        }
    }
}