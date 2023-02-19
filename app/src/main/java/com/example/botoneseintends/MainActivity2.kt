package com.example.botoneseintends

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.GregorianCalendar

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private var bnVolver : Button? = null
    private var obtener : String? = null
    private var Numero : Int? = null
    private var Frase: TextView? = null
    private var Texto : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bnVolver = findViewById(R.id.Volver)
        Botones()
        bnVolver?.setOnClickListener(this)

        obtener = intent.getStringExtra("calificacion")
        Log.d("DATOS:", "Datos recibidos con exito fueron frase $obtener")

        Frase?.text = obtener


        when(obtener){
            "0" -> Numero = 0
            "1" -> Numero = 1
            "2" -> Numero = 2
            "3" -> Numero = 3
            "4" -> Numero = 4
            "5" -> Numero = 5
            "6" -> Numero = 6
            "7" -> Numero = 7
            "8" -> Numero = 8
            "9" -> Numero = 9
            "10" -> Numero = 10
        }

        if (Numero!! < 7){
            Texto?.text = ("Siga Intentando Su Calificacion es:")
            val cambio : TextView = findViewById(R.id.TvEs)
            cambio.setTextColor(Color.RED)
        }
        else {
            Texto?.text = ("Aprobado Su Calificacion es:")
            val cambio : TextView = findViewById(R.id.TvEs)
            cambio.setTextColor(Color.GREEN)
        }

    }

    private fun Botones(){
        bnVolver = findViewById(R.id.Volver)
        Frase = findViewById(R.id.Frase)
        Texto = findViewById(R.id.TvEs)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.Volver -> {
                val vol = Intent(this, MainActivity :: class.java)
                startActivity(vol)
                finish()
            }
        }
    }

}