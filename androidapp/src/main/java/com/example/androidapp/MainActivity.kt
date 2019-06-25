package com.example.androidapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.coroutines.*
import sample.EventApi
import kotlin.coroutines.CoroutineContext

class MainActivity : FragmentActivity(), CoroutineScope {

    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewController = ViewModelProviders.of(this).get(MainViewController::class.java)

        val eventApi = EventApi()
        launch (Dispatchers.Main) {
            try {
                val result = withContext(Dispatchers.IO) {
                    eventApi.fetchEvents()
                }
                Toast.makeText(this@MainActivity, result, Toast.LENGTH_LONG).show()
            }
            catch (e: Exception) {
                Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
            }
        }

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = viewController.viewModel.title
    }
}
