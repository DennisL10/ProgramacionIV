package com.unab.clase15_10_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre:EditText
    private lateinit var etPass:EditText
    private lateinit var  etV1:EditText
    private lateinit var  etv2:EditText
    private var etResult:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNombre = findViewById(R.id.et_Nombre)
        etPass = findViewById(R.id.et_Pass)
        etV1 = findViewById(R.id.et_V1)
        etv2 = findViewById(R.id.et_V2)
        etResult = findViewById((R.id.et_Resultado))
    }

    // Se creara una funcion para el registro
    fun loguin(Vista:View) {
        val Nombre = etNombre.text.toString()
        val Password = etPass.text.toString()

        if (Nombre.length == 0) {
            Toast.makeText(this, "Debes Ingresar tu Usuario", Toast.LENGTH_LONG).show()
        }
        if (Password.length == 0){
            Toast.makeText(this, "Debes Ingresar tu Contraseña", Toast.LENGTH_LONG).show()
        }
        if(Nombre.length != 0 && Password.length != 0){
            Toast.makeText(this, "Ingresando...", Toast.LENGTH_LONG).show()
        }
    }
    // Se crea una funcion para calcular
    fun calcular (Vista:View){
        val Valor1 = etV1.text.toString()
        val Valor2 = etv2.text.toString()

        val num1:Int = Integer.parseInt(Valor1)
        val num2:Int = Integer.parseInt(Valor2)

        var suma = num1+num2
        var resultado:String = suma.toString()
        etResult?.setText(resultado)
    }
}