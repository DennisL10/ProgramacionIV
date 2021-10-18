package com.unab.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //claseHerencia()
        //claseInterface()
        ModificadoresDeVisibilidad()
    }

    private fun claseHerencia(){
        val cocinero = Cocinero("Andres", 20, "Italiana")
        cocinero.trabajar()
        cocinero.voyATrabajar()
        cocinero.estiloDeCocina()
        cocinero.conducir()

        val carpintero = Carpintero("Alfonso", 25)
        carpintero.trabajar()

    }

    private fun claseInterface(){
        val jugador = Persona("Gabriel", 20)
        jugador.jugar()
        jugador.jugando()
    }

    private fun ModificadoresDeVisibilidad(){
        /*val visible = Visibilidad()
        visible.nombre = null
        visible.decirMiNombre()*/
    }
}