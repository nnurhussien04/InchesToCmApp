package com.kotlintutorial.inchestocentimeters

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private val inches = 2.54
    private lateinit var enterInches:EditText
    private lateinit var convertButton:Button
    private lateinit var textViewCM:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        enterInches = findViewById(R.id.editTextInches)
        convertButton = findViewById(R.id.buttonConvert)
        textViewCM = findViewById(R.id.textViewConvert)
        convertButton.setOnClickListener {
           if(!enterInches.text.toString().isEmpty()){
               val result = enterInches.text.toString().toDouble() * inches
               textViewCM.text = result.toString()
           } else{
               textViewCM.text = "Please Enter a number"
           }
        }
    }


}
