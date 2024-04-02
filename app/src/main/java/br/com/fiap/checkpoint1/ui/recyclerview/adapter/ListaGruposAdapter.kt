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
 * Adaptador para exibir uma lista de grupos em um RecyclerView.
 *
 * @property context O contexto do app.
 * @property grupos A lista com os grupos que vão ser mostrados.
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
         * Método para ligar os dados de um grupo com a view.
         *
         * @param grupo O grupo que vai ser mostrado.
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
     * Método para quando a RecyclerView necessitar de mais um ViewHolder pra mostrar um item da lista de grupos.
     *
     * @param parent O ViewGroup onde o ViewHolder vai ser colocado depois de ter sido criado.
     * @param viewType O tipo de view do ViewHolder novo.
     * @return Um ViewHolder novo com a view do item.
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
     * Método que retorna o total de grupos na lista.
     *
     * @return O número total de grupos.
     */
    override fun getItemCount(): Int = grupos.size

    /**
     * Método chamado pelo RecyclerView para mostrar os grupos em uma determinada posição.
     *
     * @param holder O ViewHolder que vai ter os dados vinculados.
     * @param position A posição do item na lista.
     */
    override fun onBindViewHolder(holder: ListaGruposAdapter.ViewHolder, position: Int) {
        val grupo = grupos[position]
        holder.vincula(grupo)
    }
}
