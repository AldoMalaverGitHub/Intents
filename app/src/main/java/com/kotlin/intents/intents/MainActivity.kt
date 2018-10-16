package com.kotlin.intents.intents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarSecondActivity(view: View){
        var myIntent = Intent(this, SecondActivity::class.java)
        //myIntent.putExtra("nombres", txtNombres.text.toString())
        var myDato = Dato(txtNombres.text.toString(),
                txtApellidos.text.toString())
        myIntent.putExtra("myDato", myDato as Serializable)
        startActivity(myIntent)
    }
}
