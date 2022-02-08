package com.example.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in_screen.*
import kotlinx.android.synthetic.main.activity_sign_up_screen.*

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
   back_to_login.setOnClickListener(
       if ((password_rep.text!=sign_password.text)||(sign_name.text.isEmpty())||(sign_surname.text.isEmpty())||(sign_password.text.isEmpty())||(password_rep.text.isEmpty()){
               val text = "Поля не соответствуют типу"
               val duration = Toast.LENGTH_SHORT
               val toast = Toast.makeText(applicationContext, text, duration)
               toast.show()
           }

    }
}