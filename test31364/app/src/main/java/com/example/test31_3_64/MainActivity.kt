package com.example.test31_3_64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bmical.setOnClickListener {
            val it = Intent(this, bmi::class.java)
            startActivity(it)
        }

        bmrcal.setOnClickListener {
            val it = Intent(this, bmr::class.java)
            startActivity(it)
        }

        tdeecal.setOnClickListener {
            val it = Intent(this, tdee::class.java)
            startActivity(it)
        }

    }
}