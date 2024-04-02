package br.com.fiap.checkpoint1.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Grupo
import br.com.fiap.checkpoint1.ui.recyclerview.adapter.ListaGruposAdapter

class MainActivity : Activity() {

    /**
     * Classe principal da aplicação que está encarregada de msotrar a lista de grupos
     */

    override fun onCreate(savedInstanceState: Bundle?) {

        /**
         * Método que é chamado sempre que a activity é criada. Ele é o responsável por configurar o layout
         * e o adaptador para o RecyclerView.
         *
         * @param savedInstanceState Um objeto da classe Bundle que tem o estado da activity, se ele existir.
         */

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaGruposAdapter(
            context = this,
            grupos = listOf(
                Grupo("Grupo 1", "Gabriel, Dayane, Vinicios e Vinicius", "94841, 96067, 93018, 96108"),
                Grupo("Grupo 2", "Fulano, Ciclano e Beltrano", "11111, 22222, 33333"),
                Grupo("Grupo 3", "Maria, João, José e Marta", "10101, 20202, 30303, 40404"),
            )
        )
        // Pode ser configurado no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}