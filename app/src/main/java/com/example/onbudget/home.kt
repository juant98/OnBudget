package com.example.onbudget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var principal12:Double = intent.getDoubleExtra("PRINCIPAL_12",0.0)
        var incomeadded:Double = intent.getDoubleExtra("incometoadd",0.0)
        var finalbudget= (principal12+incomeadded).toString()
        var TextViewbudget: TextView = findViewById(R.id.budgetnumber) as TextView
        TextViewbudget.text=finalbudget
    }
}