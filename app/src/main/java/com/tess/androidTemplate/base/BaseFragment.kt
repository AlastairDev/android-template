package com.tess.androidTemplate.base


//abstract class BaseFragment<VM : ViewModel, DB : ViewDataBinding>(private val mViewModelClass: Class<VM>) : Fragment() {
//
//    @LayoutRes
//    abstract fun getLayoutRes(): Int
//
//    private var TAG = this::class.java.simpleName
//
//    val binding by lazy {
//        DataBindingUtil.setContentView(activity!!, getLayoutRes()) as DB
//    }
//
////    val viewModel by lazy {
////        ViewModelProviders.of(this).get(mViewModelClass)
////    }
//
//    open fun onInject() {}
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        initViewModel(viewModel)
//        super.onCreate(savedInstanceState)
//        onInject()
//    }
//
//    abstract fun initViewModel(viewModel: VM)
//}