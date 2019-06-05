package com.example.androidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import sample.Platform

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = Platform.name
    }
}
