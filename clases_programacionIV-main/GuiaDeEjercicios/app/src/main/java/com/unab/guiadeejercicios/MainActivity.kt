package com.unab.guiadeejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //infoUser("Andresito", 15.50, 240, 7)
        tablaDeMultiplicar(10)
        Empleado("Andres", 500.0, "Gerencia", "Jefe", 15).infoSueldo()
        Dado(5  ).lanzar()
    }

    fun infoUser(nombre:String, pagoPorHora:Double, horasLaboradas:Int, horasExtras:Int) {

        var sueldoFinal:Double = (pagoPorHora * horasLaboradas)
        var horas = (horasExtras*pagoPorHora)*2
        var sueldoMasHoras = sueldoFinal + horas

        println("Nombre del empleado: $nombre \nSueldo base: $sueldoFinal \nSueldo base mas Horas Extra: $sueldoMasHoras")
    }

    fun tablaDeMultiplicar(numero:Int){
        val termino:Int = 10;

        for (x in 1..10){
            println("$numero x $x = ${numero*x}")
        }
    }
}