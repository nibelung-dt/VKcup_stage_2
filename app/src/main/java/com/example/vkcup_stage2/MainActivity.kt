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

        // 1. опрос
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, FirstList::class.java)
            startActivity(intent)
        }

        // 2. сопоставление элементов
/*
        val matchElements: Button = findViewById(R.id.matchElements)
        matchElements.setOnClickListener {
            val intent = Intent(this, matchElements::class.java)
            startActivity(intent)
        }
*/


        // 3. перетаскивание вариантов в пропуски
        val itemsToText: Button = findViewById(R.id.itemsToText)
        itemsToText.setOnClickListener {
            val intent = Intent(this, ItemsToText::class.java)
            startActivity(intent)
        }

        // 4. заполнение пропусков в тексте
        val fillSpaces: Button = findViewById(R.id.fillSpaces)
        fillSpaces.setOnClickListener {
            val intent = Intent(this, FillSpaces::class.java)
            startActivity(intent)
        }

        // 5. рейтинг бар
        val ratingBars: Button = findViewById(R.id.ratingBars)
        ratingBars.setOnClickListener {
            val intent = Intent(this, RatingBars::class.java)
            startActivity(intent)
        }

    }
}
