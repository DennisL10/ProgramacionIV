package com.unab.funcionesyclases

class estudiante(val nombre:String, var edad:Int, val lenguajes:Array<programacion>, val amigo:Array<estudiante>?=null) {

    enum class programacion{
        KOTLIN, JAVA, PHP, JAVASCRIPT, PERL, REST, PYTHON, RUBY
    }

    fun codigo(){
        for(lenguaje:programacion in lenguajes){
            println("$nombre, edad $edad y conozco el lenguaje: " + lenguaje)
        }
    }
}