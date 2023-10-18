package com.example.viewmodellearning

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    var count:Int=0
    fun increment()
    {
        count++
    }
}