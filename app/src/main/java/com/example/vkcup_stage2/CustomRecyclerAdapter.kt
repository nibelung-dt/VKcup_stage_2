package com.example.vkcup_stage2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
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

        val text1_1: TextView = itemView.findViewById(R.id.text1_1)
        val text1_2: TextView = itemView.findViewById(R.id.text1_2)
        val text2_1: TextView = itemView.findViewById(R.id.text2_1)
        val text2_2: TextView = itemView.findViewById(R.id.text2_2)
        val text3_1: TextView = itemView.findViewById(R.id.text3_1)
        val text3_2: TextView = itemView.findViewById(R.id.text3_2)
        val text4_1: TextView = itemView.findViewById(R.id.text4_1)
        val text4_2: TextView = itemView.findViewById(R.id.text4_2)

        val relLayout1: RelativeLayout = itemView.findViewById(R.id.relLayout1)
        val relLayout2: RelativeLayout = itemView.findViewById(R.id.relLayout2)
        val relLayout3: RelativeLayout = itemView.findViewById(R.id.relLayout3)
        val relLayout4: RelativeLayout = itemView.findViewById(R.id.relLayout4)

        val image1: ImageView = itemView.findViewById(R.id.image1)
        val image2: ImageView = itemView.findViewById(R.id.image2)
        val image3: ImageView = itemView.findViewById(R.id.image3)
        val image4: ImageView = itemView.findViewById(R.id.image4)


       // val button1: Button = itemView.findViewById(R.id.button2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // holder.largeTextView.text = names[position]
        holder.largeTextView.text = names[position].question
        holder.smallTextView.text = "Вопрос 1/1"
       // holder.button1.button = names[position].answers[0]  // setText
       // holder.button1.text = names[position].answers[0]
        holder.text1_1.text = names[position].answers[0]
        holder.text2_1.text = names[position].answers[1]
        holder.text3_1.text = names[position].answers[2]
        holder.text4_1.text = names[position].answers[3]

        // holder.text1_2.text = names[position].percents[0]
        // holder.text2_2.text = names[position].percents[0]
        // holder.text3_2.text = names[position].percents[0]
        // holder.text4_2.text = names[position].percents[0]

        var touch1 = false
        var touch2 = false
        var touch3 = false
        var touch4 = false
        var listenersDisabled = false


        holder.relLayout1.setOnClickListener { v ->
           // holder.relLayout1.background =
            if (!touch1 && !listenersDisabled) {
                holder.relLayout1.setBackgroundColor(Color.parseColor("#C0FEDF")) // зеленый
                holder.image1.setVisibility(View.VISIBLE)

                holder.text1_2.text = names[position].percents[0]
                holder.text2_2.text = names[position].percents[1]
                holder.text3_2.text = names[position].percents[2]
                holder.text4_2.text = names[position].percents[3]

                touch1 = true
                listenersDisabled = true
            } else if (touch1 && listenersDisabled) {
                holder.relLayout1.setBackgroundColor(Color.parseColor("#DAFCFB"))

                holder.text1_2.text = ""
                holder.text2_2.text = ""
                holder.text3_2.text = ""
                holder.text4_2.text = ""

                holder.image1.setVisibility(View.INVISIBLE)
                touch1 = false
                listenersDisabled = false
            }
        }

        holder.relLayout2.setOnClickListener { v ->
            if (!touch2 && !listenersDisabled) {
                holder.relLayout2.setBackgroundColor(Color.parseColor("#C0FEDF")) // зеленый

                holder.text1_2.text = names[position].percents[0]
                holder.text2_2.text = names[position].percents[1]
                holder.text3_2.text = names[position].percents[2]
                holder.text4_2.text = names[position].percents[3]

                holder.image2.setVisibility(View.VISIBLE)
                touch2 = true
                listenersDisabled = true
            } else if (touch2 && listenersDisabled) {
                holder.relLayout2.setBackgroundColor(Color.parseColor("#DAFCFB"))

                holder.text1_2.text = ""
                holder.text2_2.text = ""
                holder.text3_2.text = ""
                holder.text4_2.text = ""

                holder.image2.setVisibility(View.INVISIBLE)
                touch2 = false
                listenersDisabled = false
            }
        }

        holder.relLayout3.setOnClickListener { v ->
            if (!touch3 && !listenersDisabled) {
                holder.relLayout3.setBackgroundColor(Color.parseColor("#C0FEDF")) // зеленый

                holder.text1_2.text = names[position].percents[0]
                holder.text2_2.text = names[position].percents[1]
                holder.text3_2.text = names[position].percents[2]
                holder.text4_2.text = names[position].percents[3]

                holder.image3.setVisibility(View.VISIBLE)
                touch3 = true
                listenersDisabled = true
            } else if (touch3 && listenersDisabled) {
                holder.relLayout3.setBackgroundColor(Color.parseColor("#DAFCFB"))

                holder.text1_2.text = ""
                holder.text2_2.text = ""
                holder.text3_2.text = ""
                holder.text4_2.text = ""

                holder.image3.setVisibility(View.INVISIBLE)
                touch3 = false
                listenersDisabled = false
            }
        }

        holder.relLayout4.setOnClickListener { v ->
            if (!touch4 && !listenersDisabled) {
                holder.relLayout4.setBackgroundColor(Color.parseColor("#C0FEDF")) // зеленый

                holder.text1_2.text = names[position].percents[0]
                holder.text2_2.text = names[position].percents[1]
                holder.text3_2.text = names[position].percents[2]
                holder.text4_2.text = names[position].percents[3]

                holder.image4.setVisibility(View.VISIBLE)
                touch4 = true
                listenersDisabled = true
            } else if (touch4 && listenersDisabled) {
                holder.relLayout4.setBackgroundColor(Color.parseColor("#DAFCFB"))

                holder.text1_2.text = ""
                holder.text2_2.text = ""
                holder.text3_2.text = ""
                holder.text4_2.text = ""

                holder.image4.setVisibility(View.INVISIBLE)
                touch4 = false
                listenersDisabled = false
            }
        }
/*
        fun setPercents() {
            holder.text1_2.text = names[position].percents[0]
            holder.text2_2.text = names[position].percents[1]
            holder.text3_2.text = names[position].percents[2]
            holder.text4_2.text = names[position].percents[3]
        }
*/

    }

    override fun getItemCount() = names.size
}


