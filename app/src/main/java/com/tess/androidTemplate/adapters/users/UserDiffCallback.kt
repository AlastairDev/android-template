package com.tess.androidTemplate.adapters.users

import androidx.recyclerview.widget.DiffUtil
import com.tess.androidTemplate.repository.database.users.UsersModel

class UserDiffCallback : DiffUtil.ItemCallback<UsersModel>() {

    override fun areItemsTheSame(oldItem: UsersModel, newItem: UsersModel): Boolean {
        return oldItem.userId == newItem.userId
    }

    override fun areContentsTheSame(oldItem: UsersModel, newItem: UsersModel): Boolean {
        return oldItem == newItem
    }
}