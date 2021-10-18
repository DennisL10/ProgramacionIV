package com.unab.setyget

class Automovil (mar:String, col:String, pre:Int){

    var marca = mar
    var color = col
    var precio = pre
    var velocidadMaxima = 0
        get() = field + 10
        set(value) {
            field = value
        }

    fun encender(){
        println("-> El vehiculo se ha encendido.")
    }

    fun apagar(){
        println("-> El vehiculo se ha apagado.")
    }

    fun acelerar(){
        println("-> El vehiculo se ha acelerado.")
    }

    fun detener(){
        println("-> El vehiculo ha frenado")
    }
}