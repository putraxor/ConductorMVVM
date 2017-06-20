package com.github.putraxor.conductormvvm.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.github.putraxor.conductormvvm.R
import com.github.putraxor.conductormvvm.databinding.HomeViewBinding
import com.github.putraxor.conductormvvm.model.Group
import com.github.putraxor.conductormvvm.viewmodel.HomeViewModel

/**
 * Created by putraxor on 20/06/17.
 */

class HomeController : Controller() {

    lateinit private var binding: HomeViewBinding
    private val viewModel = HomeViewModel()

    /**
     * Home last adapter item click listener
     */
    private val itemClickListener = object : HomeViewModel.OnItemClick {
        override fun onClick(item: Group, index: Int) {
            val bundle = Bundle()
            bundle.putInt(DetailController.GROUP_INDEX_KEY, index)
            val transaction = RouterTransaction.with(DetailController(bundle))
                    .pushChangeHandler(HorizontalChangeHandler())
                    .popChangeHandler(HorizontalChangeHandler())
            router.pushController(transaction)
        }
    }

    /**
     * Inflate view with databinding
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_view, container, false)
        binding.vm = viewModel
        viewModel.onItemClickListener = itemClickListener
        return binding.root
    }
}