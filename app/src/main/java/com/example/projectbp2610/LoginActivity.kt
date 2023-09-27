package com.example.projectbp2610

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explicit
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)

        //event btn login click
        btnLogin.setOnClickListener {
            //validate
            if (txtUsername.text.toString().equals("yuana") &&
                txtPassword.text.toString().equals("amikom")
            ) {
                //call home activity
                val intentHome = Intent(this, MainActivity::class.java)
                startActivity(intentHome)
            } else {
                Toast.makeText(
                    this, "Username/Password salah!!!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}