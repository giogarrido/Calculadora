package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //variables
    var numUno: Int = 0
    var numDos: Int = 0
    var resultado: Double = 0.0
    var operacion: Int = 0
    var auxS: String =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operacion: TextView = findViewById(R.id.tvOperacion)
        val captura: TextView = findViewById(R.id.tvCaptura)
        val suma: Button = findViewById(R.id.btnSuma)
        val resta: Button = findViewById(R.id.btnResta)
        val multiplicar: Button = findViewById(R.id.btnMultiplicar)
        val dividir: Button = findViewById(R.id.btnDividir)
        val borrar: Button = findViewById(R.id.btnBorrar)
        val resultado: Button = findViewById(R.id.btnResult)
        val uno: Button = findViewById(R.id.btnUno)
        val dos: Button = findViewById(R.id.btnDos)
        val tres: Button = findViewById(R.id.btnTres)
        val cuatro: Button = findViewById(R.id.btnCuatro)
        val cinco: Button = findViewById(R.id.btnCinco)
        val seis: Button = findViewById(R.id.btnSeis)
        val siete: Button = findViewById(R.id.btnSiete)
        val ocho: Button = findViewById(R.id.btnOcho)
        val nueve: Button = findViewById(R.id.btnNueve)

        while (true){
            uno.setOnClickListener {

                auxS=auxS+"1"
                captura.setText(auxS)
            }
            dos.setOnClickListener {

                auxS=auxS+"2"
                captura.setText(auxS)
            }


        }



    }


}