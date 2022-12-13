package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PrintDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_details)

        val tvName = findViewById<TextView>(R.id.tVName)

        val tvAge = findViewById<TextView>(R.id.tVAge)

        val tvOccupation = findViewById<TextView>(R.id.tVOccupation)

        val bundle = intent.extras

        if(bundle!=null){
            tvName.text = "Name = ${bundle.getString("Name")}"
            tvAge.text = "Age = ${bundle.getString("Age")}"
            tvOccupation.text = "Occupation = ${bundle.getString("Occupation")}"
        }

    }
}