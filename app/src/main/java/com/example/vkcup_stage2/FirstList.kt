package com.example.vkcup_stage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_list)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(list)  //fillList())


    }
/*
    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }
    */

/*
    private fun fillList2(): Questions {
        return
    }
*/
    val first = Questions("first", listOf("один", "два", "три", "четыре"), listOf("10%", "25%", "25%", "40%"))
    val second = Questions("second", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val third = Questions("second", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val forth = Questions("second", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val five = Questions("second", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val list = mutableListOf(first, second, third, forth, five)



//@Override
    // list.size(Questions)

    //list.add(first)
   // val list = mutableListOf(first)
   // list.add(second)
    //val list2 = mutableListOf<Int>()

    /*
    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.cat_names).toList()
    }
*/
   //  recyclerView.adapter = CustomRecyclerAdapter(getCatList())

}