package com.example.calculadorakt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.text.DecimalFormat

private var nro1: EditText? = null
private var nro2: EditText?= null
private var resultado: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nro1 = findViewById<View>(R.id.txt_num1) as EditText
        nro2 = findViewById<View>(R.id.txt_num2) as EditText
        resultado = findViewById<View>(R.id.txt_resultado) as TextView
    }

    fun sumar(view: View?){
        val valor1=nro1!!.text.toString()
        val valor2=nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val suma = n1 + n2
        val resu = suma.toString()
        resultado!!.text = resu
        Toast.makeText(this,"eligió sumar", Toast.LENGTH_SHORT).show()

    }
    fun restar(view: View?){
        val valor1=nro1!!.text.toString()
        val valor2=nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val resta = n1 - n2
        val resu = resta.toString()
        resultado!!.text = resu
        Toast.makeText(this,"eligió restar", Toast.LENGTH_SHORT).show()

    }
    fun multiplicar(view: View?){
        val valor1=nro1!!.text.toString()
        val valor2=nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val mult = n1 * n2
        val resu = mult.toString()
        resultado!!.text = resu
        Toast.makeText(this,"eligió multiplicar", Toast.LENGTH_SHORT).show()

    }
    fun dividir(view: View?){
        val decimalFormat = DecimalFormat("#0.##")
        val valor1=nro1!!.text.toString()
        val valor2=nro2!!.text.toString()
        val n1 = valor1.toFloat()
        val n2 = valor2.toFloat()
        val div = n1 / n2
        val resu = decimalFormat.format(div.toDouble())
        resultado!!.text = resu
        Toast.makeText(this,"eligió dividir", Toast.LENGTH_SHORT).show()

    }
    fun borrar(view: View?){
        resultado!!.text=""
        nro1!!.text=null
        nro2!!.text=null

    }
}