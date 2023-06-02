package com.newzarc.newzarc

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun clickMe(button: Button, activity: Activity) {
        button.setOnClickListener {
            val intent = Intent(this, activity::class.java)
            startActivity(intent)
        }
    }



}