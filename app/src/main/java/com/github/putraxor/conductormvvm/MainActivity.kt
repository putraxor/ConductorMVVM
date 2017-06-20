package com.github.putraxor.conductormvvm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.github.putraxor.conductormvvm.view.HomeController

/**
 * Created by putraxor on 20/06/17.
 */

class MainActivity : AppCompatActivity() {

    private val container by lazy { findViewById(R.id.controller_container) as ViewGroup }
    lateinit private var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router = Conductor.attachRouter(this, container, savedInstanceState)
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(HomeController()))
        }
    }

    override fun onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed()
        }
    }

}