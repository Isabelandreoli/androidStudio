package com.isabela.lembrete

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.isabela.lembrete.api.Repository
import com.isabela.lembrete.model.Categoria
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {

    val repository = Repository()

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    fun listCategoria(){
        viewModelScope.launch {
            _myCategoriaResponse.value = repository.listCategoria()
        }
    }

}