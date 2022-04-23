package com.example.larningkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()

        //An Intent is basically a message that is passed between components (such as Activities, Services, Broadcast Receivers, and Content Providers).
        val intent = Intent(this, BirthdayGreeting::class.java)

        //passing name from one activity to other
        intent.putExtra("name", BirthdayGreeting.NAME_EXTRA)

        //here this is context of current class and BirthdayGreeting::class.java is the activity we want to go

        startActivity(intent)
    }
}