package br.com.fiap.gs1

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    private lateinit var buttonFragment1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFragment1 = findViewById(R.id.buttonFragment1)


    }
}






