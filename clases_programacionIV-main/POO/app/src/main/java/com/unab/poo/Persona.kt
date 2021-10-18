package com.unab.poo

open class Persona(nombre:String, edad:Int):Trabajo(), Juego {
    //cualquier clase tienen en comun una clase any

    open fun trabajar(){
        println("Esta persona esta trabajando")
    }

    override fun voyATrabajar(){
        println("Se dirige a trabajar")
    }

    //Interface Juego
    override val juego = "Futbol"
    override fun jugar(){
        println("Esta persona esta jugando al $juego")
    }
}