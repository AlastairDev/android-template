package com.tess.androidTemplate.adapters.users

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tess.androidTemplate.databinding.ItemUserBinding
import com.tess.androidTemplate.repository.database.users.UsersModel


class UserAdapter : ListAdapter<UsersModel, UserAdapter.ViewHolder>(UserDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = getItem(position)
        holder.apply {
            bind(createOnClickListener(user), user)
            itemView.tag = user
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemUserBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    private fun createOnClickListener(user: UsersModel): View.OnClickListener {
        return View.OnClickListener {

        }
    }

    class ViewHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: UsersModel) {
            binding.apply {
                clickListener = listener
                user = item
                executePendingBindings()
            }
        }
    }
}