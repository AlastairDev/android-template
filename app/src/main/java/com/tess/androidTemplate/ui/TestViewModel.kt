package com.tess.androidTemplate.ui

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.tess.androidTemplate.repository.Repository

class TestViewModel(private val repository : Repository) : ViewModel(){

    var testfield = ObservableField<String>("test")

    fun sayHello(){
        testfield.set(repository.giveHello())
    }

}