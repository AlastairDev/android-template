package com.tess.androidTemplate.ui.users

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.tess.androidTemplate.repository.UserRepository
import com.tess.androidTemplate.repository.database.users.UsersModel

class UsersViewModel internal constructor(usersRepository: UserRepository) : ViewModel() {

    var userList = MediatorLiveData<List<UsersModel>>()

    init {
        userList.addSource(usersRepository.getUsers(), userList::setValue)
    }

}
