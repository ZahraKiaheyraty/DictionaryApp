package com.example.dic_assest.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dic_assest.data.db.entity.Dictionary
import com.example.dic_assest.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(var repository:MainRepository) :ViewModel(){

    var state= MutableStateFlow<List<Dictionary>>(emptyList())
    var _state= state.asStateFlow()


init {
//    subscriber()
}



     fun subscriber(){
        viewModelScope.launch {
            repository.getAllDetails().collect {allData->
                state.value= allData
            }

        }

    }
}