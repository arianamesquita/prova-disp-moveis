package com.example.provadispmoveis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.provadispmoveis.adapters.CardapioAdapter
import com.example.provadispmoveis.model.Cardapio
import com.example.provadispmoveis.model.CardapioData

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listview)
        val cardapio = CardapioData.getCardapio()
        listView.adapter = CardapioAdapter(this, cardapio)

        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, idx: Int, id: Long){
        var cardapio = parent.getItemAtPosition(idx) as Cardapio
        if(cardapio.nome === "Comidas" || cardapio.nome === "Mercearia"){
            Toast.makeText(this, "Ainda temos essa opção disponível", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(baseContext, BebidasActivity::class.java)
            startActivity(intent)
        }
    }
}