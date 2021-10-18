package com.unab.guiadeejercicios

class Dado(var numero:Int) {

    fun lanzar(){
        var const1 = 1
        var finalnumber = 0

        if(numero >=1 && numero <=6){
            var random = (1..40).random()
            finalnumber = random
            println("El numero que introdujo es: $numero")
            println("El numero aleatorio es: $finalnumber")
        }
        else{
            finalnumber = const1
            println("El numero que introdujo es: $numero")
            println("Usted ha arrojado un valor mayor que 6, por tanto: $finalnumber")
        }
    }
}