package com.example.onbudget

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var bi :Boolean =false
    var once :Boolean =false
    var month :Boolean =false
    var principal1=1.0
    var income2=1.0
lateinit var principal: EditText
lateinit var income2edit: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        principal=findViewById(R.id.principalbank)
        income2edit=findViewById(R.id.income)
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_biweekly ->
                    if (checked) {
                        bi=true
                    }
                R.id.radio_weekly ->
                    if (checked) {
                        once=true
                    }
                R.id.radio_monthly ->
                    if (checked) {
                        month=true
                    }
            }
        }

    }
    fun onButtonsubClicked(view: View){
principal1=principal.text.toString().toDouble()
income2=income2edit.text.toString().toDouble()
val intenthome=Intent(this,home::class.java).apply{
putExtra("PRINCIPAL_12",principal1)
putExtra("incometoadd",income2)
}
startActivity(intenthome)
    }
}