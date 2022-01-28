package com.example.miprimeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton2 = findViewById<Button>(R.id.button2)
        boton2.text="Botonsito"
        var txt1 = findViewById<TextView>(R.id.texto1)

        boton2.setOnClickListener(){
            boton2.text="BOTONSOTE"
            txt1.text="HOY GANA ECUADOR"
        }
    }


}