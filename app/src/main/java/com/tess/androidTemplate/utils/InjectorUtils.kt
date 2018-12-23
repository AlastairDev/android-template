package com.tess.androidTemplate.utils

import android.content.Context
import com.tess.androidTemplate.repository.UserRepository
import com.tess.androidTemplate.repository.database.AppDatabase
import com.tess.androidTemplate.ui.users.UsersViewModelFactory

object InjectorUtils {

    private fun getUserRepository(context: Context): UserRepository {
        return UserRepository.getInstance(AppDatabase.getInstance(context).usersDao())
    }

    fun provideUsersViewModelFactory(context: Context): UsersViewModelFactory {
        val repository = getUserRepository(context)
        return UsersViewModelFactory(repository)
    }
}