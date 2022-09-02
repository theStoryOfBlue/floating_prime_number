package com.example.floating_prime_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result : Double = 0.0
        var result2 = 0.0
        var result3 = ""
        for(i in 1..10){
            result += round(0.14*1000)/1000
            result2 += 0.14e10
//            Log.e(javaClass.simpleName, "onCreate: $result", )
            Log.e(javaClass.simpleName, "onCreate2: ${result2}")
        }
//        result2 = result2.toString().substring(result2.toString().lastIndexOf("E")+1).toDouble()
        result3 = result2.toString().substring(0, result2.toString().indexOf("E"))

        Log.e(javaClass.simpleName, "onCreate2: ${result3}")
    }
}