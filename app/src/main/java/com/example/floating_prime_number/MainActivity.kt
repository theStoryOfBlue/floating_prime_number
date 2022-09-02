package com.example.floating_prime_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result2 = 0.0
        var result3 = ""
        var result4 = 0.0
        for(i in 1..10){
            result2 += 0.14e10
            result4 += 0.14
//            Log.e(javaClass.simpleName, "onCreate2: ${result2}")
            Log.e(javaClass.simpleName, "onCreate2: ${String.format("%.2f",result4)}")
        }
        result3 = result2.toString().substring(0, result2.toString().indexOf("E"))

//        Log.e(javaClass.simpleName, "onCreate2: ${result3}")
//        Log.e(javaClass.simpleName, "onCreate2: ${result3}")
    }
}