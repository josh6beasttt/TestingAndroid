package com.example.josh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            textView {
                text = "Hello Josh"
            }
        }
    }
}