package com.tess.androidTemplate.repository.database.users

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UsersDao {

    @Query("SELECT * FROM users ORDER BY id")
    fun getUsers(): LiveData<List<UsersModel>>

    @Query("SELECT * FROM users WHERE id = :userId")
    fun getUser(userId: String): LiveData<UsersModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userModels: List<UsersModel>)

}
