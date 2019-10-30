package com.example.dependencyinjectionapp.dagger

import com.example.dependencyinjectionapp.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, IPresenterModule::class])
interface AppComponent {
    fun inject(target: MainActivity)
}