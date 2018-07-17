package com.tess.android_template.ui

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.tess.android_template.repository.Repository

class TestViewModel(private val repository : Repository) : ViewModel(){

    var testfield = ObservableField<String>("test")

    fun sayHello(){
        testfield.set(repository.giveHello())
    }

}