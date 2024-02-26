package com.example.app_project_ernar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var mail: EditText
    private lateinit var phone: EditText
    private lateinit var password: EditText
    private lateinit var btn_next: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val log_in_hyper_link = findViewById<TextView>(R.id.log_in_hyper_link)

        log_in_hyper_link.movementMethod = LinkMovementMethod.getInstance()
        log_in_hyper_link.setOnClickListener(){
            val intent = Intent(this@RegistrationActivity, LogInActivity::class.java)
            startActivity(intent)
        }
        name = findViewById(R.id.name)
        mail = findViewById(R.id.mail)
        phone = findViewById(R.id.phone)
        password = findViewById(R.id.password)
        btn_next = findViewById(R.id.btn_next)

        btn_next.setOnClickListener(){

        }
    }
}