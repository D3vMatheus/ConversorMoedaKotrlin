package com.example.conversorrealdolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.Login)

        btnLogin.setOnClickListener {
            val username = findViewById<EditText>(R.id.Username).text.toString()
            val password = findViewById<EditText>(R.id.Password).text.toString()

            if (username == "usuario" && password == "senha") {
                startActivity(Intent(this, OptionsActivity::class.java))
            } else {
                Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
