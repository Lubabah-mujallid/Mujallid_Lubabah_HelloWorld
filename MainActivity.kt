package com.example.demoday4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello console!!")
        Log.d("MainActaivity","Hello from the log")
        var x = calculate(4f,4f, '*')
        if(x == 16f)
            Log.d("MainActaivity","X has a value is $x")
        else
            Log.d("MainActaivity","X does not equal 16")
    }
}
fun calculate(num1: Float, num2: Float, operator: Char): Float {
    var cal: Float = 0f
    when (operator) {
        '*' -> cal = num1 * num2
        '/' -> cal = num1 / num2
        '+' -> cal = num1 + num2
        '-' -> cal = num1 - num2
        //else -> println("else??")
    }
    return cal
}