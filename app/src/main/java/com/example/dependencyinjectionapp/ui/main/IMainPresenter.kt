package com.example.dependencyinjectionapp.ui.main

interface IMainPresenter {

    interface Presenter {
        fun setView(view: View)
        fun onViewCreated()
        fun onScreenTapped()
        fun loadData()
    }

    interface View {
        fun displayCount(number: Int)
    }
}