package com.example.vkcup_stage2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, FirstList::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, DragItems::class.java)
            startActivity(intent)
        }

        val ratingBars: Button = findViewById(R.id.ratingBars)
        ratingBars.setOnClickListener {
            val intent = Intent(this, RatingBars::class.java)
            startActivity(intent)
        }
    }
}
