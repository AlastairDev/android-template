package com.tess.android_template.base

import android.arch.lifecycle.ViewModel
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlin.reflect.KClass
import org.koin.android.architecture.ext.viewModelByClass

abstract class BaseActivity<VM : ViewModel, DB : ViewDataBinding>(var layoutId: Int,var clazz: KClass<VM>) : AppCompatActivity() {

    val viewModel: VM by viewModelByClass(true, clazz)

    var TAG = this::class.java.simpleName

    lateinit var binding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId) as DB
        initBindingComponent()
    }

    abstract fun initBindingComponent()
}



