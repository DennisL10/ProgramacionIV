package com.unab.metodosyclases

class MiClaseAnidadaEInterna {

    private val uno = 1

    private fun retornaUno():Int{
        return uno
    }

    //Clase que pueden tener otras clases
    class MiClaseAnidada{

        fun suma(n1:Int, n2:Int):Int{

            return (n1+n2)
        }
    }

    //Clases internas (inner class)
    inner class MiClaseInterna{

        /*private val uno =1
        fun restar(numero:Int):Int{
            return numero + uno
        }*/

        fun restarDos(numero:Int):Int{
            return numero - uno - retornaUno()
        }
    }
}