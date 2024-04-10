package br.com.fiap.checkpoint1.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Grupo
import br.com.fiap.checkpoint1.ui.recyclerview.adapter.ListaGruposAdapter

class MainActivity : Activity() {

    /**
     * A classe Activity será a responsável por fazer a apresentação dos grupos que serão listados dentro da tela principal do nosso aplicativo
     */

    override fun onCreate(savedInstanceState: Bundle?) {

        /**
         * O Método em questão será sempre chamada a partir do momento em que a activity é criada. Ele é o responsável por fazer a configuração do layout
         * e será aquele que fará o "meio campo" para que possamos utilizar o RecyclerView.
         *
         * @param savedInstanceState é um objeto da classe Bundle que tem o estado em que está a activity, se ele já tiver sido criado previamente.
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
        // A linha a seguir pode ser configurado tambem no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}