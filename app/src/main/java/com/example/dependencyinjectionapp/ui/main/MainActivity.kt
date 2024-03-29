package com.example.dependencyinjectionapp.ui.main

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionapp.BaseApp
import com.example.dependencyinjectionapp.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity(), IMainPresenter.View {

    @Inject
    lateinit var presenter: MainPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as BaseApp).baseComponent.inject(this)
        presenter.setView(this)
        presenter.onViewCreated()

    }

    override fun displayCount(number: Int) {
        mainCount.text = number.toString()
    }

    fun countTapped(view: View) {
        presenter.onScreenTapped()
    }
}
