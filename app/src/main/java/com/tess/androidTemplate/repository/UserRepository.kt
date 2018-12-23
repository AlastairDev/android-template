package com.tess.androidTemplate.repository

import com.tess.androidTemplate.repository.database.users.UsersDao

class UserRepository private constructor(private val usersDao: UsersDao) {

    fun getUsers() = usersDao.getUsers()

    companion object {
        @Volatile
        private var instance: UserRepository? = null

        fun getInstance(plantDao: UsersDao) = instance ?: synchronized(this) {
            instance ?: UserRepository(plantDao).also {
                instance = it
            }
        }
    }
}