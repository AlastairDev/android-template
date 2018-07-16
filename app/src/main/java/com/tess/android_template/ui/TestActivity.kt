package com.tess.android_template.ui

import android.os.Bundle
import android.os.PersistableBundle
import com.tess.android_template.R
import com.tess.android_template.base.BaseActivity
import com.tess.android_template.databinding.ActivityMainBinding
import org.koin.android.architecture.ext.viewModel

class TestActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutRes() = R.layout.activity_main

    val model = viewModel<TestViewModel>()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        model.value.sayHello()
    }

}