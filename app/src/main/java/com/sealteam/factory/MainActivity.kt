package com.sealteam.factory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next=findViewById<TextView>(R.id.create)
        next.setOnClickListener {
            val a= Intent(this,details::class.java)
            startActivity(a)}
        }

    }
