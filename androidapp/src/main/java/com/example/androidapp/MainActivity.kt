package com.example.androidapp

import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewController = ViewModelProviders.of(this).get(MainViewController::class.java)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = viewController.viewModel.title
    }
}
