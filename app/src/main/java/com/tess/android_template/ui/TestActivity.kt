package com.tess.android_template.ui

import com.tess.android_template.R
import com.tess.android_template.base.BaseActivity
import com.tess.android_template.databinding.ActivityMainBinding
import com.tess.android_template.ext.logE
import com.tess.android_template.ext.toastL

class TestActivity : BaseActivity<TestViewModel, ActivityMainBinding>(R.layout.activity_main, TestViewModel::class) {

    override fun initBindingComponent() {
        binding.viewModel = viewModel
        viewModel.sayHello()
        logE("test")
        toastL("test")
    }

}
