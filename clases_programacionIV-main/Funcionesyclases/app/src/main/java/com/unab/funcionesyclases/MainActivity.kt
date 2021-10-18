package com.unab.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //seguridadNula()
        funciones()
        claseyherencia()
    }

    /*Aqui se estara viendo la seguridad contra nulos (null safety)*/
    fun seguridadNula(){
        var myString = "Programacion IV (16/09/2021)"
        //myString = null Esto nos dara un error
        println(myString)

        //Variable con seguridad nula (null safety)
        var mySeguridadNula: String? = "Valor de la variable nula"
        mySeguridadNula =  null
        println(mySeguridadNula)

        mySeguridadNula = "Le volvemos a dar un nuevo valor"
        println(mySeguridadNula)

        /*if(mySeguridadNula != null){
            println(mySeguridadNula)
        }*/

        //Llamadas seguras (safe calls)
        println(mySeguridadNula?.length)
        mySeguridadNula?.let {
            println(it)
        }?:kotlin.run { println(mySeguridadNula) }
    }

    //aqui estaremos hablando de las funciones
    fun funciones(){
        decirHola()
        decirNombre("Andres")
        decirNombre("Eduardo")
        decirNombre("Cordova")
        decirNombreEdad("Andrezuki", 20)
        sumarDosNumeros(2, 4)
    }

    //funcion simple
    fun decirHola(){
        println("Hola alumnos de programacion iv")
        println("Hola alumnos de programacion iv")
        println("Hola alumnos de programacion iv")
    }

    //La funcion que permite la entrada de un parametro
    fun decirNombre(nombre:String){
        println("Hola compas, mi nombre es: $nombre")
    }

    fun decirNombreEdad(nombre:String, edad:Int){
        println("Hola compas, mi nombre es: $nombre y tengo $edad years old")
    }

    //funciones que me retornen un valor
    fun sumarDosNumeros(p1:Int, p2:Int){

        var suma = p1 + p2
        return println("La suma de los numeros seria $suma")
    }

    fun claseyherencia(){

        var student_one = estudiante("Andres Cordova", 20, arrayOf(estudiante.programacion.JAVA, estudiante.programacion.PYTHON, estudiante.programacion.KOTLIN), null)
        student_one.edad = 30
        println(student_one.edad)
        student_one.codigo()

        var student_two = estudiante("Julio Miguel", 19, arrayOf(estudiante.programacion.PYTHON, estudiante.programacion.REST, estudiante.programacion.RUBY), arrayOf(student_one))
        println(student_two.nombre)
        student_two.codigo()

        println("${student_two.amigo?.first()?.nombre} es amigo de ${student_two.nombre}")
    }
}