package com.example.app_project_ernar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val register_hyper_link = findViewById<TextView>(R.id.register_hyper_link)
        register_hyper_link.movementMethod = LinkMovementMethod.getInstance()
        register_hyper_link.setOnClickListener(){
            val intent = Intent(this@LogInActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}