package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //variables
    var numUno: Double = 0.0
    var numDos: Double = 0.0
    var resultado: Double = 0.0
    var oper: Int = 0
    var auxS: String = ""
    lateinit var captura: TextView
    lateinit var operacion: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        captura = findViewById(R.id.tvCaptura)
        operacion = findViewById(R.id.tvOperacion)

        val borrar: Button = findViewById(R.id.btnBorrar)
        val result: Button = findViewById(R.id.btnResult)

        result.setOnClickListener {

            if (captura.text.isEmpty() || result.text.isEmpty()) {

            } else {
                numDos = captura.text.toString().toDouble()

                when (oper) {

                    1 -> resultado = numUno + numDos
                    2 -> resultado = numUno - numDos
                    3 -> resultado = numUno * numDos
                    4 -> resultado = numUno / numDos
                }

                operacion.setText(resultado.toString())
                captura.setText("")
                oper=0
            }


        }

        borrar.setOnClickListener {
            captura.setText("")
            operacion.setText("")
            numDos = 0.0
            numUno = 0.0
            oper = 0
        }

    }

    fun presionarBoton(view: View) {
        //val captura: TextView = findViewById(R.id.tvCaptura)
        var num2: String = captura.text.toString()

        when (view.id) {
            R.id.btnCero -> captura.setText(num2 + "0")
            R.id.btnUno -> captura.setText(num2 + "1")
            R.id.btnDos -> captura.setText(num2 + "2")
            R.id.btnTres -> captura.setText(num2 + "3")
            R.id.btnCuatro -> captura.setText(num2 + "4")
            R.id.btnCinco -> captura.setText(num2 + "5")
            R.id.btnSeis -> captura.setText(num2 + "6")
            R.id.btnSiete -> captura.setText(num2 + "7")
            R.id.btnOcho -> captura.setText(num2 + "8")
            R.id.btnNueve -> captura.setText(num2 + "9")

        }
    }

    fun clickOperacion(view: View) {
        numUno = captura.text.toString().toDouble()
        var numDosText: String = captura.text.toString()
        captura.setText("")
        //oper 1-> suma  2-> Resta  3-> Multiplicacion  4-> Division
        when (view.id) {
            R.id.btnSuma -> {
                operacion.setText(numDosText + "+")
                oper = 1
            }

            R.id.btnResta -> {
                operacion.setText(numDosText + "-")
                oper = 2
            }

            R.id.btnMultiplicar -> {
                operacion.setText(numDosText + "*")
                oper = 3
            }

            R.id.btnDividir -> {
                operacion.setText(numDosText + "/")
                oper = 4
            }
        }
    }


}