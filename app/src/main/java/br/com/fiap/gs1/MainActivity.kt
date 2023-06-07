package br.com.fiap.gs1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)

        // Aqui você pode controlar a navegação entre os fragmentos usando o NavController
        // Por exemplo, definindo cliques em botões para navegar para os fragmentos desejados

        // Exemplo de navegação para Fragment2 ao clicar em um botão:
        /*
        button.setOnClickListener {
            navController.navigate(R.id.action_fragment1_to_fragment2)
        }
        */
    }
}


