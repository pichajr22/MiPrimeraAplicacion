package com.example.miprimeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    override fun onPause() {
        super.onPause()
    println("LA APP ESTA EN ESTADO DE PAUSA")
    }

    override fun onResume() {
        super.onResume()
        println("ENTRANDO EN ESTADO ON RESUME")
    }

    override fun onStart() {
        super.onStart()
        println("APP INICIADA ON START")
    }
}
