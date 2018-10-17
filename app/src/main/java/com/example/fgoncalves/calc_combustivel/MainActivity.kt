package com.example.fgoncalves.calc_combustivel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Calculo para identificar qual combustivel está mais em conta.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        result_btn.setOnClickListener {

            if (val1_txt.text.toString().toDouble() * 0.70 > val2_txt.text.toString().toDouble()) {



                Toast.makeText(this, "Alcool esta mais em conta!", Toast.LENGTH_LONG).show()

            } else {


                Toast.makeText(this,"Gasolina esta mais mais em conta!", Toast.LENGTH_LONG).show()
            }

        }

    }
}