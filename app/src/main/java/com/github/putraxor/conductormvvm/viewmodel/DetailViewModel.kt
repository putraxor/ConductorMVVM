package com.github.putraxor.conductormvvm.viewmodel

import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.net.Uri
import android.view.View
import com.github.putraxor.conductormvvm.BR
import com.github.putraxor.conductormvvm.model.DataProvider
import com.github.putraxor.conductormvvm.model.Group

/**
 * Created by putraxor on 21/06/17.
 */
class DetailViewModel : BaseObservable() {
    @get:Bindable
    var group = Group()
        set(group) {
            field = group
            notifyPropertyChanged(BR.group)
        }

    @get:Bindable
    var groupIndex = 0
        set(groupIndex) {
            field = groupIndex
            group = DataProvider.findByIndex(groupIndex)
            notifyPropertyChanged(BR.groupIndex)
        }

    /**
     * VisitLink event listener
     */
    fun onClickVisitLink(v: View) {
        val browser = Intent(Intent.ACTION_VIEW)
        browser.data = Uri.parse(group.link)
        v.context.startActivity(browser)
    }
}