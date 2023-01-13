package com.example.vkcup_stage2

import android.content.ClipData
import android.content.ClipDescription
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ItemsToText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_to_text)


        val IMAGEVIEW_TAG = "icon bitmap"
        val text_tag = "text tag"
        val word = findViewById<TextView>(R.id.word)
/*
        val textView = TextView(this).apply {
            tag = text_tag
            setOnLongClickListener { v ->
                val item = ClipData.Item(v.tag as? CharSequence)

            }
        }
        */

/*
        val imageView = ImageView(this).apply {
            // Sets the bitmap for the ImageView from an icon bit map (defined elsewhere).
            setImageBitmap()
            tag = IMAGEVIEW_TAG
            setOnLongClickListener { v ->
                // Create a new ClipData.
                // This is done in two steps to provide clarity. The convenience method
                // ClipData.newPlainText() can create a plain text ClipData in one step.

                // Create a new ClipData.Item from the ImageView object's tag.
                val item = ClipData.Item(v.tag as? CharSequence)

                // Create a new ClipData using the tag as a label, the plain text MIME type, and
                // the already-created item. This creates a new ClipDescription object within the
                // ClipData and sets its MIME type to "text/plain".
                val dragData = ClipData(
                    v.tag as? CharSequence,
                    arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN),
                    item)

                // Instantiate the drag shadow builder.
                val myShadow = MyDragShadowBuilder(this)

                // Start the drag.
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(dragData,  // The data to be dragged
                        myShadow,  // The drag shadow builder
                        null,      // No need to use local data
                        0          // Flags (not currently used, set to 0)
                    )
                }

                // Indicate that the long-click was handled.
                true
            }
        }
*/
    }



}

