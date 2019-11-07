package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener{
            calcBmi()
        }
        btnReset.setOnClickListener{
            reset()
        }
    }
    private fun calcBmi(){
        val weight = txtWeight.text.toString().toDouble()
        val height = txtHeight.text.toString().toDouble()

        val BMI = weight/ height.pow(2)

        txtBmi.text = String.format("%2f",BMI)

        if(BMI < 18.5){
            txtStatus.text = "Underweight"
            imageView.setImageResource(R.drawable.under)

        }
        else if(BMI < 24.9){
            txtStatus.text = "Normal"
            imageView.setImageResource(R.drawable.normal)

        }
        else{
            txtStatus.text = "Overweight"
            imageView.setImageResource(R.drawable.over)


        }
    }
    private fun reset(){
        txtWeight.text.clear()
        txtHeight.text.clear()
    }
}


