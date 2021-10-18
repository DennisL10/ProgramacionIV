package com.unab.setyget

class Empleado {

    var edad = 0
    get() = field
    set(value){
        if (value>=18 && value<=80){
            field = value
            println("-> Felicidades, ya puedes trabajar")
        }
        else if(value<18){
            println("-> Aun no tienen edad para trabajar [edad menor a 18]")
        }
        else{
            println("-> Eres demasido viejo para trabajar")
        }

    }

    var nombre:String? = null
    get() = field?.uppercase()
    set(value) {
        if(value!!.isEmpty()){
            println("El nombre debe tener texto")
        }
        else{
            field =  value
        }
    }

    /*
    public fun setEdad(_edad:Int){
        if (_edad >= 18 && _edad <= 80){
            edad = _edad
        }
        else if (_edad < 18 ){
            println("-> Aun no tienen edad para trabajar [edad menor a 18]")
        }
        else{
            println("-> Eres demasido viejo para trabajar")
        }
    }

    public fun setNombre(_nombre:String){
        if(_nombre.isEmpty()){
            println("El nombre debe tener texto")
        }
        else{
            nombre = _nombre
        }
    }
    */


}