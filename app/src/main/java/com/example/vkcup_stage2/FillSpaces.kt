package com.example.vkcup_stage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FillSpaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_spaces)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapterFillSpaces()

    }

}



/*

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_weight="2"
    tools:context=".FillSpaces">




        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <TextView
                android:id="@+id/textView"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="В траве сидел"
                android:textSize="20dp"
                tools:layout_editor_absoluteX="16dp"
                tools:layout_editor_absoluteY="57dp" />

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/fillSpace1"
                android:layout_width="114dp"
                android:layout_height="48dp"
                android:textSize="20dp"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.505"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.061" />


            <TextView
                android:id="@+id/textView3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="совсем, как"
                android:textSize="20dp"
                tools:layout_editor_absoluteX="271dp"
                tools:layout_editor_absoluteY="57dp" />

        </LinearLayout>






        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal"
             >


            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/fillSpace2"
                android:layout_width="122dp"
                android:layout_height="44dp"
                android:textSize="20dp"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.048"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.131" />

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/fillSpace3"
                android:layout_width="144dp"
                android:layout_height="44dp"
                android:textSize="20dp"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.561"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.131" />

            <TextView
                android:id="@+id/textView4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="он был."
                android:textSize="20dp"
                tools:layout_editor_absoluteX="311dp"
                tools:layout_editor_absoluteY="107dp" />

        </LinearLayout>




</LinearLayout>


 */