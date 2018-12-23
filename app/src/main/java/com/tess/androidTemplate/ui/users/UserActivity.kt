package com.tess.androidTemplate.ui.users

import androidx.lifecycle.*
import com.tess.androidTemplate.R
import com.tess.androidTemplate.adapters.users.UserAdapter
import com.tess.androidTemplate.base.BaseActivity
import com.tess.androidTemplate.databinding.ActivityMainBinding
import com.tess.androidTemplate.utils.InjectorUtils

class UserActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main), LifecycleOwner {

    private var mLifecycleRegistry = LifecycleRegistry(this)
    private lateinit var viewModel: UsersViewModel

    override fun initBindingComponent() {
        mLifecycleRegistry.markState(Lifecycle.State.CREATED)
        val context = binding.root.context

        val factory = InjectorUtils.provideUsersViewModelFactory(context)
        viewModel = ViewModelProviders.of(this, factory).get(UsersViewModel::class.java)

        binding.userListRecyclerView.adapter = UserAdapter()
        viewModel.userList.observe(this, Observer {
            if (it != null){
                (binding.userListRecyclerView.adapter as UserAdapter).submitList(it)
            }
        })
    }

    public override fun onStart() {
        super.onStart()
        mLifecycleRegistry.markState(Lifecycle.State.STARTED)
    }

    override fun onDestroy() {
        mLifecycleRegistry.markState(Lifecycle.State.DESTROYED)
        super.onDestroy()
    }

    override fun onResume() {
        mLifecycleRegistry.markState(Lifecycle.State.RESUMED)
        super.onResume()
    }

    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry
    }

}
