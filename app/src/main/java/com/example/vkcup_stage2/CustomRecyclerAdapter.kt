package com.example.vkcup_stage2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
val first = Questions("first", listOf("dfdsf", "aaa"), listOf("10%", "20%"))
println(first.question)
println(first.answers[0])
println(first.percents[1])
*/

// class CustomRecyclerAdapter(private val names: List<String>) : RecyclerView
// .Adapter<CustomRecyclerAdapter.MyViewHolder>() {
class CustomRecyclerAdapter(private val names: List<Questions>) : RecyclerView
.Adapter<CustomRecyclerAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)

        val button1: Button = itemView.findViewById(R.id.button2)
        val button2: Button = itemView.findViewById(R.id.button3)
        val button3: Button = itemView.findViewById(R.id.button4)
        val button4: Button = itemView.findViewById(R.id.button5)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // holder.largeTextView.text = names[position]
        holder.largeTextView.text = names[position].question
        holder.smallTextView.text = "кот"
       // holder.button1.button = names[position].answers[0]  // setText
        holder.button1.text = names[position].answers[0]
        holder.button2.text = names[position].answers[1]
        holder.button3.text = names[position].answers[2]
        holder.button4.text = names[position].answers[3]
/*
        holder.button1.setOnClickListener { v ->
            // Here your start your other activity or navigate to another fragment
        }
        */


    }

    override fun getItemCount() = names.size
}