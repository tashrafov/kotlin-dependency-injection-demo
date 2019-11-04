package com.example.dependencyinjectionapp.ui.main

import javax.inject.Inject


class MainPresenter @Inject constructor() : IMainPresenter.Presenter {

    private lateinit var view: IMainPresenter.View
    private var count: Int = 0

    override fun setView(view: IMainPresenter.View) {
        this.view = view
    }


    override fun onViewCreated() {
        loadData()
    }

    override fun onScreenTapped() {
        count++
        loadData()
    }

    override fun loadData() {
        view.displayCount(count)
    }

}