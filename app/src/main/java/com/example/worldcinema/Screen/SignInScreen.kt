package com.example.worldcinema.Screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcinema.R
import kotlinx.android.synthetic.main.activity_sign_in_screen.*

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
        button_sign
    }
}