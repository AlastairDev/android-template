package com.tess.androidTemplate

import android.app.Application
import com.tess.androidTemplate.repository.UserRepository
import com.tess.androidTemplate.ui.users.UsersViewModel
import org.koin.android.ext.android.startKoin
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

class App : Application(){

    companion object {
        var liveCycleLogLevel = LogLevel.NONE
    }

    override fun onCreate() {
        super.onCreate()
//        startKoin(this, listOf(myModule))
    }

//    private val myModule : Module = module {
//        viewModel { UsersViewModel(get()) }
//        single { UserRepository() as Repository }
//    }
}

enum class LogLevel{
    E,D,V,W,I,NONE
}