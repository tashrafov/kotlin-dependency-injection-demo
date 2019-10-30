package com.example.dependencyinjectionapp.dagger

import com.example.dependencyinjectionapp.ui.main.IMainPresenter
import com.example.dependencyinjectionapp.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class IPresenterModule {
    @Provides
    @Singleton
    fun provideMainPresenter(): IMainPresenter.Presenter = MainPresenter()
}