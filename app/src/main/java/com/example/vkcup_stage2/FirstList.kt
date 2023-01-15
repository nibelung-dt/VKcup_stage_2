package com.example.vkcup_stage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FirstList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_list)

        val newObject = WorkWithQuestions.Questions("первый вопрос", "Вопрос 1/5", listOf("один", "два", "три", "четыре"), listOf("10%", "25%", "25%", "40%"))
        val listOfQuestions =  newObject.createListOfQuestions()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(listOfQuestions)

    }
}