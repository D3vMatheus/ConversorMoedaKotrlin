package com.example.conversorrealdolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val btnDollarToReal = findViewById<Button>(R.id.btn_dollar_to_real)
        val btnRealToDollar = findViewById<Button>(R.id.btn_real_to_dollar)


        btnDollarToReal.setOnClickListener {
            val valorASerConvertido = findViewById<EditText>(R.id.valor).text.toString()

            val valorConvertido = valorASerConvertido.toFloat() * 5.04
            Toast.makeText(this, " U$$: $valorASerConvertido é equivalente a R$: ${String.format("%.2f", valorConvertido)}", Toast.LENGTH_LONG).show()
        }

        btnRealToDollar.setOnClickListener {
            val valorASerConvertido = findViewById<EditText>(R.id.valor).text.toString()

            val valorConvertido = valorASerConvertido.toFloat() / 5.04
            Toast.makeText(this, " R$: $valorASerConvertido equivale a U$$: ${String.format("%.2f", valorConvertido)}", Toast.LENGTH_LONG).show()
        }
    }
}