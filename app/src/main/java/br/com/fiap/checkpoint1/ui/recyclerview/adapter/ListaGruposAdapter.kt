package br.com.fiap.checkpoint1.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Grupo

/**
 * Adaptador que será utilizado posteriormente exibir uma lista de grupos em um RecyclerView.
 *
 * @property context A função será a responsável por fazer contexto do app.
 * @property grupos A lista com os grupos que foram previamente definidos e que serão exibidos posteriormente.
 */
class ListaGruposAdapter(
    private val context: Context,
    private val grupos: List<Grupo>
) : RecyclerView.Adapter<ListaGruposAdapter.ViewHolder>() {

    /**
     * Classe ViewHolder que representa cada um dos itens da lista de grupos.
     *
     * @param view A view que representa um item da lista dos grupos.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /**
         * Método que será o responsável por ligar os dados de um grupo com a view.
         *
         * @param grupo Esse será o grupo que será exibido na tela do nosso aplicativo.
         */
        fun vincula(grupo: Grupo) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = grupo.nome

            val alunos = itemView.findViewById<TextView>(R.id.alunos)
            alunos.text = grupo.alunos

            val rms = itemView.findViewById<TextView>(R.id.rms)
            rms.text = grupo.rms
        }
    }

    /**
     * Método para quando a RecyclerView mostrar que necessita de um ou mais ViewHolder pra mostrar o item da lista de grupos.
     *
     * @param parent O ViewGroup onde o ViewHolder em questâo vai ser inserido depois de ter sido criado.
     * @param viewType O tipo da nova ViewHolder que estará no aplicativo.
     * @return Um novo ViewHolder que contará com a view do item.
     */
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaGruposAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.grupo_item, parent, false)
        return ListaGruposAdapter.ViewHolder(view)
    }

    /**
     * Método que irá retornar o total de grupos presentes na lista.
     *
     * @return O número total de grupos.
     */
    override fun getItemCount(): Int = grupos.size

    /**
     * Método chamado pelo RecyclerView que irá mostrar os grupos em sua respectiva posição.
     *
     * @param holder O ViewHolder que será responsável por ter os dados vinculados.
     * @param position A posição que o item ocupa na lista.
     */
    override fun onBindViewHolder(holder: ListaGruposAdapter.ViewHolder, position: Int) {
        val grupo = grupos[position]
        holder.vincula(grupo)
    }
}
