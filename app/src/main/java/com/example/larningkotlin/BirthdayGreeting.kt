package com.example.larningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayGreeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        //captured the name from main.kt
        //getStringExtra is used because we passed string in this activity
        val name = intent.getStringExtra("name")
    }
}