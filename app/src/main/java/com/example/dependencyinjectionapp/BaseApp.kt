package com.example.dependencyinjectionapp

import android.app.Application
import com.example.dependencyinjectionapp.dagger.AppComponent
import com.example.dependencyinjectionapp.dagger.AppModule
import com.example.dependencyinjectionapp.dagger.DaggerAppComponent

class BaseApp : Application() {
    lateinit var baseComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        baseComponent = initDagger(this)
    }

    private fun initDagger(app: BaseApp) =
        DaggerAppComponent.builder()
            .appModule(AppModule(app))
            .build()
}