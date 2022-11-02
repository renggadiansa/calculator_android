package com.example.ulanganrengga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast





class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding
//
//
//    lateinit var username : EditText
//    lateinit var password : EditText
//    lateinit var loginText: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.button.setOnClickListener(View.OnClickListener {
//            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234"){
//                Toast.makeText(this, "Yeyyyyy, bisa LOGIN !!!!", Toast.LENGTH_SHORT).show()
//                binding.button.setOnClickListener {
//                    startActivity(Intent(this@MainActivity, Home::class.java))
//                }
//            }else {
//                Toast.makeText(this, "Kasian tidak bisa LOGIN wkwkwk", Toast.LENGTH_SHORT).show()
//            }
//        })
        val username = findViewById(R.id.username) as EditText
        val password = findViewById(R.id.password) as EditText
        val button =findViewById(R.id.button) as Button

         button.setOnClickListener {
             if (username.text.toString() == "admin" && password.text.toString() == "1234") {
                 Toast.makeText(this, "Selamat Datang di Aplikasi Kalkulator Pintar", Toast.LENGTH_SHORT).show()
                 startActivity(Intent(this@MainActivity, Home::class.java))

             } else {
                 Toast.makeText(this, "Kasian tidak bisa LOGIN wkwkwk", Toast.LENGTH_SHORT).show()


             }
         }


    }
}