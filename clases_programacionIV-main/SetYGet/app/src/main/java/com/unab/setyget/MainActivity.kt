package com.unab.setyget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        empleado()
        automovil()
    }

    fun empleado(){

        var e1 = Empleado()
        e1.edad = 19
        e1.nombre = "Andresito guapo"
        println(e1.edad)
        println(e1.nombre)
    }

    fun automovil(){
        var toyota:Automovil = Automovil("Toyota", "Negro", 40000)
        println("El vehiculo que tienes es un: " + toyota.marca + " su color es ${toyota.color}")
        println("Su precio es de $" + toyota.precio)
        toyota.apagar()
        toyota.velocidadMaxima = 120
        println("Su velocidad maxima es: ${toyota.velocidadMaxima} km/h")

        var honda:Automovil = Automovil("Honda", "Gris", 13450)
        println("El vehiculo que tienes es un: " + honda.marca + " su color es ${honda.color}")
        println("Su precio es de $" + honda.precio)
        honda.encender()
    }
}