package com.unab.poo

private class Visibilidad {

    private var nombre:String?="Pepe"
    private fun decirMiNombre(){
        nombre?.let {
            println("Mi nombre es: $it")
        }?:run {
            println("No se escribir.")
        }
    }
}

open class Visibilidad2 {
    protected fun decirMiNombre2(){
        val visible = Visibilidad()

    }
}

class Visibilidad3:Visibilidad2() {
    val edad:Int? = null
    fun decirMiNombreOtraVez(){
        decirMiNombre2()
    }
}