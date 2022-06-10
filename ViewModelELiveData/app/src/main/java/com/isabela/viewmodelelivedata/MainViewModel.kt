package com.isabela.viewmodelelivedata

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var cont = 0

    fun addNum(){
        cont++
    }
}