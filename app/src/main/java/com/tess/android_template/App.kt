package com.tess.android_template

import android.app.Application
import com.tess.android_template.repository.MyRepository
import com.tess.android_template.repository.Repository
import com.tess.android_template.ui.TestViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(myModule))
    }

    private val myModule : Module = applicationContext {
        viewModel { TestViewModel(get()) }
        bean { MyRepository() as Repository }
    }
}
