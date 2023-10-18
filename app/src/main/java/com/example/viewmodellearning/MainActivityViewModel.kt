package com.example.viewmodellearning

import androidx.lifecycle.ViewModel

class MainActivityViewModel(val initial:Int):ViewModel() {

    var count:Int=initial
    fun increment()
    {
        count++
    }
}