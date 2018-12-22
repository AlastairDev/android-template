package com.tess.androidTemplate.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tess.androidTemplate.ext.logLC

abstract class BaseActivity<DB : ViewDataBinding>(private var layoutId: Int) : AppCompatActivity() {

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



