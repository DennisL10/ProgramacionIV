package com.unab.poo

class Carpintero(nombre:String, edad:Int):Persona(nombre, edad) {
    override fun trabajar(){
        println("Esta persona esta perforando una madera")
        super.trabajar()
    }
}