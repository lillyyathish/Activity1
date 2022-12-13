package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.editTextPersonName)
        val etAge = findViewById<EditText>(R.id.editTextAge)
        val etOccupation = findViewById<EditText>(R.id.editTextOccupation)

        val continueBtn = findViewById<Button>(R.id.button)
        continueBtn.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("Name",etName.text.toString())
            bundle.putString("Age",etAge.text.toString())
            bundle.putString("Occupation",etOccupation.text.toString())

            val intent = Intent(this,PrintDetails::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }

}