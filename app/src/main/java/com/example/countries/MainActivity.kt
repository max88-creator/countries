package com.example.countries

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val countries = arrayOf("Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selection = findViewById<TextView>(R.id.selection)
        val countriesList = findViewById<ListView>(R.id.countriesList)
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1, countries
        )
        countriesList.adapter = adapter
     
    }
}