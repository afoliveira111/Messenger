package com.example.messenger.core.authentication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.R

interface LoginCallback{
    fun onCreateAccountClicked()
}

class LoginActivity : AppCompatActivity(), LoginCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onCreateAccountClicked() {

    }
}