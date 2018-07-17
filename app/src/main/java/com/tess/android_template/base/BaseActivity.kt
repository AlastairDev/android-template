package com.tess.android_template.base

import android.arch.lifecycle.ViewModel
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tess.android_template.ext.logLC
import kotlin.reflect.KClass
import org.koin.android.architecture.ext.viewModelByClass

abstract class BaseActivity<VM : ViewModel, DB : ViewDataBinding>(var layoutId: Int,var clazz: KClass<VM>) : AppCompatActivity() {

    val viewModel: VM by viewModelByClass(true, clazz)

    lateinit var binding: DB

    abstract fun initBindingComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logLC("onCreate")
        binding = DataBindingUtil.setContentView(this, layoutId) as DB
        initBindingComponent()
    }

    override fun onStart() {
        logLC("onStart")
        super.onStart()
    }

    override fun onResume() {
        logLC("onResume")
        super.onResume()
    }

    override fun onPause() {
        logLC("onPause")
        super.onPause()
    }

    override fun onStop() {
        logLC("onStop")
        super.onStop()
    }

    override fun onRestart() {
        logLC("onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        logLC("onDestroy")
        super.onDestroy()
    }
}



