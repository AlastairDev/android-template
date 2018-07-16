package com.tess.android_template.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {

    @LayoutRes
    abstract fun getLayoutRes(): Int

    private var TAG = this::class.java.simpleName

    val binding by lazy {
        DataBindingUtil.setContentView(this, getLayoutRes()) as DB
    }
}