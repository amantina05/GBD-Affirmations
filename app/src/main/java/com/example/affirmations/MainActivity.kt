package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView = findViewById(R.id.textview)
//
//        //code to create and display the size of affirmations list
//            //calling loadAffirmations get the size of list & convert to string & assign it as text of textView
//        textView.text = Datasource().loadAffirmations().size.toString()

        //initializing data
        val myDataset = Datasource().loadAffirmations()
        var recylclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recylclerView.adapter = ItemAdapter(this,myDataset)
        recylclerView.setHasFixedSize(true)
    }
}