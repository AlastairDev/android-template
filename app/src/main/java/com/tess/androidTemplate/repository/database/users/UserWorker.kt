package com.tess.androidTemplate.repository.database.users

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.tess.androidTemplate.repository.database.AppDatabase

class UserWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    private val TAG by lazy { UserWorker::class.java.simpleName }

    override fun doWork(): Result {
        return try {
            val database = AppDatabase.getInstance(applicationContext)
            val userModelList = arrayListOf<UsersModel>()
            userModelList.add(UsersModel("1","FN1","LN1",25,"111-111-1111"))
            userModelList.add(UsersModel("2","FN2","LN2",25,"222-222-2222"))
            userModelList.add(UsersModel("3","FN3","LN3",25,"333-333-3333"))
            userModelList.add(UsersModel("4","FN4","LN4",25,"444-444-4444"))
            userModelList.add(UsersModel("5","FN5","LN5",25,"555-555-5555"))
            userModelList.add(UsersModel("6","FN6","LN6",25,"666-666-6666"))
            userModelList.add(UsersModel("7","FN7","LN7",25,"777-777-7777"))
            userModelList.add(UsersModel("8","FN8","LN8",25,"888-888-8888"))
            database.usersDao().insertAll(userModelList)
            Result.success()
        } catch (ex: Exception) {
            Log.e(TAG, "Error seeding database", ex)
            Result.failure()
        }
    }
}