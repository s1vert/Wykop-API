package com.tomaszstankowski.wykopapi

import com.tomaszstankowski.wykopapi.ui.activity.LinkActivity
import com.tomaszstankowski.wykopapi.ui.fragment.PromotedFragment
import com.tomaszstankowski.wykopapi.viemodel.LinkViewModel
import com.tomaszstankowski.wykopapi.viemodel.PromotedViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton @Component(modules = arrayOf(
        AppModule::class,
        ServiceModule::class,
        PersistenceModule::class,
        EventModule::class
))
interface AppComponent {
    fun inject(viewModel: PromotedViewModel)
    fun inject(fragment: PromotedFragment)
    fun inject(activity: LinkActivity)
    fun inject(viewModel: LinkViewModel)
}