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

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, SecondList::class.java)
            startActivity(intent)
        }
    }
}
