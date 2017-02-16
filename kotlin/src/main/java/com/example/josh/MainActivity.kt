package com.example.josh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var helloText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText = findViewById(R.id.helloText) as TextView?
        helloText!!.text = "Hello Josh"
    }
}
