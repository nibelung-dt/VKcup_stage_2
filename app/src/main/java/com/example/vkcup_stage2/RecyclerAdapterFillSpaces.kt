package com.example.vkcup_stage2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

    class RecyclerAdapterFillSpaces() : RecyclerView
.Adapter<RecyclerAdapterFillSpaces.MyViewHolder>() {

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterFillSpaces.MyViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_fill_spaces2, parent, false)
            return RecyclerAdapterFillSpaces.MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: RecyclerAdapterFillSpaces.MyViewHolder, position: Int) {
        }


        override fun getItemCount(): Int {
            return 100
        }
    }