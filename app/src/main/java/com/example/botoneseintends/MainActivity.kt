package com.example.botoneseintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var bnEnviar : Button? = null
    private var calificacion : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Iniciar_Botones()
        bnEnviar?.setOnClickListener(this)



    }
    private fun Iniciar_Botones(){
        bnEnviar = findViewById(R.id.BnEnviar)
        calificacion = findViewById(R.id.Numero)
    }
    private fun obtener(): String {
        return calificacion?.text.toString()
    }

    override fun onClick(p0: View?) {

        val calific = calificacion?.text.toString()
        when(p0?.id){
            R.id.BnEnviar -> {
                val numero = obtener()
                val seg = Intent(this, MainActivity2::class.java)
                seg.putExtra("calificacion", numero)
                startActivity(seg)


            }
        }
    }
}