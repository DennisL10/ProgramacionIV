package com.unab.guiadeejercicios

class Empleado(var nombre:String, var sueldo:Double, var area:String, var cargo:String, var worktime:Int) {

    fun infoSueldo(){
        if(sueldo < 0){
            println("No se permiten sueldos negativos!!")
        }
        else if(area.isEmpty() || cargo.isEmpty()){
            println(" Atencion, los campos de area o cargo, no pueden quedar vacios!!")
        }
        else{
            var SueldoExtra:Int = 25*(worktime/5)
            var SueldoTotal = SueldoExtra + sueldo

            println("Nombre: $nombre, tiene $worktime anios de trabajo, su suedo base es de $sueldo y el total por sus anios laborados es $SueldoTotal")
        }
    }
}