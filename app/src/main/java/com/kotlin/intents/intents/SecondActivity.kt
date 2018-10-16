package com.kotlin.intents.intents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var myDato = intent.extras.get("myDato") as Dato
        //var nombres = intent.getStringExtra("nombres")
        txtResultado.setText("Mis Nombres son: ${myDato.nombres} ${myDato.apellidos}"  )
    }
}
