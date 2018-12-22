package com.tess.androidTemplate.ui

import com.tess.androidTemplate.R
import com.tess.androidTemplate.base.BaseActivity
import com.tess.androidTemplate.databinding.ActivityMainBinding
import com.tess.androidTemplate.ext.logE
import com.tess.androidTemplate.ext.toastL

class TestActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {



    override fun initBindingComponent() {
//        binding.viewModel = viewModelStore
//        viewModel.sayHello()
        logE("test")
        toastL("test")
    }

}
