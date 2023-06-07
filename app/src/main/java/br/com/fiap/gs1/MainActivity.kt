package br.com.fiap.gs1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val loginButton = findViewById<Button>(R.id.button_login)

    loginButton.setOnClickListener {
        val intent = Intent(this, SegundaActivity::class.java)
        startActivity(intent)
    }
    
}