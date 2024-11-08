package com.example.provadispmoveis.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.provadispmoveis.R
import com.example.provadispmoveis.model.Cardapio

class CardapioAdapter(private val context: Context, private val cardapio: List<Cardapio>): BaseAdapter() {
    override fun getCount(): Int {
        return cardapio.size
    }

    override fun getItem(position: Int): Any{
        return cardapio[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.adapter_cardapio, parent, false)
        val tCardapio = view.findViewById<TextView>(R.id.textView)
        val cardapio = cardapio[position]
        tCardapio.text = cardapio.nome
        return view
    }
}