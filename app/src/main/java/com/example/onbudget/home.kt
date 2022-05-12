package com.example.onbudget

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*

class home : AppCompatActivity(),DatePickerDialog.OnDateSetListener {
    var day=0
    var month=0
    var year=0
    var hour=0
    var minute=0
    var savedDay =0
    var savedMonth=0
    var savedYear=0
    var biweek:Boolean=false
    var onceweek:Boolean=false
    var monthlyweek:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var principal12: Double = intent.getDoubleExtra("PRINCIPAL_12", 0.0)
        var incomeadded: Double = intent.getDoubleExtra("incometoadd", 0.0)
        biweek=intent.getBooleanExtra("biweek",false)
        onceweek=intent.getBooleanExtra("week",false)
        monthlyweek=intent.getBooleanExtra("monthly",false)
        var finalbudget = (principal12).toString()
        var TextViewbudget: TextView = findViewById(R.id.budgetnumber) as TextView
        TextViewbudget.text = finalbudget
        pickdate()
    }
    private fun gettime(){
        val cal = Calendar.getInstance()
        day=cal.get(Calendar.DAY_OF_MONTH)
        month=cal.get (Calendar.MONTH)
        year=cal.get (Calendar.YEAR)
        hour=cal.get(Calendar.HOUR)
        minute=cal.get(Calendar.MINUTE)

    }
    fun pickdate(){
button3.setOnClickListener{
    gettime()
    DatePickerDialog(this,this,year,month,day).show()
}
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, dayofmonth: Int) {
        savedDay=dayofmonth
        savedMonth=month
        savedYear=year
        println("$savedDay + $savedMonth + $savedYear")
    }
}