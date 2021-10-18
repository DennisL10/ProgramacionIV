package com.unab.metodosyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Clases enumeradas o enum class
        //enumClases()
        //Clases Anidadas(nested class) y clases internas (inner class)
        claseAnidadaEInterna()
    }

    //Aqui abordaremos las clases enumeradas
    enum class direcciones(val dir:Int){
        NORTE(1), SUR(-1), ESTE(1), OESTE(-1), NOROESTE(1), NORESTE(-1), SUROESTE(1), SURESTE(-1);

        fun descripcion():String{
            return when(this){
                NORTE -> "-> VAS EN SENTIDO NORTE"
                SUR -> "-> VAS EN SENTIDO SUR"
                ESTE -> "-> VAS EN SENTIDO ESTE"
                NOROESTE -> "-> VAS EN SENTIDO NOROESTE"
                NORESTE -> "-> VAS EN SENTIDO NORESTE"
                SUROESTE -> "-> VAS EN SENTIDO SUROESTE"
                SURESTE -> "-> VAS EN SENTIDO SURESTE"
                else -> "No se sabe la direccion"
            }
        }
    }
    private fun enumClases(){
        //Asignacion de valores
        var direccionUsuario:direcciones?=null
        println(direccionUsuario)
        direccionUsuario = direcciones.SURESTE
        println("-> Direccion actual $direccionUsuario")
        direccionUsuario = direcciones.NORESTE
        println("-> Direccion actual $direccionUsuario")

        //propiedades por defecto (name: devuelve el valor, y ordinal: posicion)
        println("La propiedad name: ${direccionUsuario.name}")
        println("La propiedad ordinal: ${direccionUsuario.ordinal}")

        direccionUsuario = direcciones.SUROESTE
        println(direccionUsuario.descripcion())
    }

    //aqui veremos las clases aninadas y clases internas
    private fun claseAnidadaEInterna(){

        //clase anidada(nester class)
        val miClaseAnidada = MiClaseAnidadaEInterna.MiClaseAnidada()
        val sumar = miClaseAnidada.suma(10, 15)
        println("-> El resultado de la suma es: $sumar")

        //clase interna
        val miClaseInterna = MiClaseAnidadaEInterna().MiClaseInterna()
        val restarDos = miClaseInterna.restarDos(4)
        println("-> El resultado de la resta es: $restarDos")

    }

}