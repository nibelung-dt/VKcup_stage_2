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

        var number = 6
        // val percents = mutableListOf(15, 20, 25, 40)
        repeat(95) {
            val instanceOfQuestion = Questions("Вопрос", "Вопрос $number/100",
                listOf("один", "два", "три", "четыре"), listOf("15%", "20%", "25%", "40%"))
            // question = "Вопрос"
            // numberQuestion = "Вопрос $it/100"
            list.add( instanceOfQuestion )
            number++
            //instanceOfQuestion.remove
        }


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
    val first = Questions("первый вопрос", "Вопрос 1/5", listOf("один", "два", "три", "четыре"), listOf("10%", "25%", "25%", "40%"))
    val second = Questions("второй вопрос", "Вопрос 2/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val third = Questions("третий вопрос", "Вопрос 3/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val forth = Questions("четвертый вопрос", "Вопрос 4/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val five = Questions("пятый вопрос", "Вопрос 5/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val list = mutableListOf(first, second, third, forth, five)
    // val list2 = mutableListOf<Questions>()




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

