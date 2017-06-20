package com.github.putraxor.conductormvvm.common

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.github.nitrico.lastadapter.LastAdapter

/**
 * Created by putraxor on 21/06/17.
 */

@BindingAdapter("imageResId")
fun setImageResId(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}

@BindingAdapter("lastAdapter")
fun setLastAdapter(view: RecyclerView, adapter: LastAdapter) {
    adapter.into(view)
}