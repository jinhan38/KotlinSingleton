package com.kotlinsingleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val normal = NormalClass()
        val normal2 = NormalClass()
        val singleton = MySingletonClass
        val singleton2 = MySingletonClass

        Log.e(TAG, "onCreate: $normal", )
        Log.e(TAG, "onCreate: $normal2", )
        Log.e(TAG, "onCreate: $singleton", )
        Log.e(TAG, "onCreate: $singleton2", )


    }
}