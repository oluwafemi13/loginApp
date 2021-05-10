package com.example.loginapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButton()
    }
        private fun loginButton(){
            val login:Button = findViewById<Button>(R.id.login_button)
            val email = findViewById<EditText>(R.id.edit_email)
            val password= findViewById<EditText>(R.id.edit_password)
            val listview = findViewById<ListView>(R.id.funFactView)

            login.setOnClickListener(){
                if (email.toString().isNullOrEmpty()|| password.toString().isNullOrEmpty()){
                    Toast.makeText(this, "Email or Password not Provided",Toast.LENGTH_LONG).show()
                }
                else if(email.toString()="mike@gmail.com" && password.toString()="123456789"){
                    val intent:Intent = Intent(this, setContentView(listview))
                    startActivity(intent)
                }
            }
        }
}
