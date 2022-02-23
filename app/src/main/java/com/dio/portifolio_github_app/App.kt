package com.dio.portifolio_github_app

import android.app.Application
import com.dio.portifolio_github_app.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
    }
}