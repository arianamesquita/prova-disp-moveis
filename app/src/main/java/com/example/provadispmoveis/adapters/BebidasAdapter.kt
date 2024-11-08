package com.example.provadispmoveis.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.provadispmoveis.R
import com.example.provadispmoveis.model.Bebidas

class BebidasAdapter(
    private val context: Context,
    private val bebidas: List<Bebidas>?,
    private val onClickListener: BebidasOnClickListener):
    RecyclerView.Adapter<BebidasAdapter.BebidasViewHolder>() {

    interface BebidasOnClickListener {
        fun onClickBebidas(holder: BebidasViewHolder?, idx: Int)
    }

    override fun onCreateViewHolder(
            viewGroup: ViewGroup,
            viewType: Int
        ): BebidasViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.adapter_bebidas, viewGroup, false)
            return BebidasViewHolder(view)
    }

    override fun getItemCount(): Int = bebidas!!.size

    override fun onBindViewHolder(
        holder: BebidasViewHolder,
        position: Int ) {
        val bebida = bebidas!![position]
        holder.tNome.text = bebida.nome

        holder.itemView.setOnClickListener {
            onClickListener.onClickBebidas(holder, position)
        }
    }

    class BebidasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tNome: TextView = view.findViewById(R.id.textbebidas)
    }
}

