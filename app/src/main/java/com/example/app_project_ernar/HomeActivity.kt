package com.example.app_project_ernar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.content.Intent
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val slide1 = findViewById<LinearLayout>(R.id.slide1)
        val slide2 = findViewById<LinearLayout>(R.id.slide2)
        val slide3 = findViewById<LinearLayout>(R.id.slide3)

        slide1.visibility = View.VISIBLE
        slide2.visibility = View.GONE
        slide3.visibility = View.GONE

        val btn_go_to_log_in = findViewById<Button>(R.id.bttn_go_to_log_in)
        val btn_next_slide = findViewById<Button>(R.id.bttn_next_slide)

        btn_next_slide.setOnClickListener() {
            if (slide1.visibility == View.VISIBLE) {
                slide1.visibility = View.GONE
                slide2.visibility = View.VISIBLE
            }
            else if (slide1.visibility == View.GONE){
                slide1.visibility = View.GONE
                slide2.visibility = View.GONE
                slide3.visibility = View.VISIBLE
                btn_next_slide.visibility = View.GONE
                btn_go_to_log_in.visibility = View.VISIBLE
            }
        }

        btn_go_to_log_in.setOnClickListener(){
            val intent = Intent(this@HomeActivity, LogInActivity::class.java)
            startActivity(intent)
        }
    }
}