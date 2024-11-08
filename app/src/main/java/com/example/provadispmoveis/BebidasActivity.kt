package com.example.provadispmoveis

import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.provadispmoveis.adapters.BebidasAdapter
import com.example.provadispmoveis.model.Bebidas
import com.example.provadispmoveis.model.BebidasData

class BebidasActivity: AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private var bebidas: List<Bebidas>? = emptyList()
    private lateinit var adapter: BebidasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        bebidas = BebidasData.getBebidas()

        adapter = BebidasAdapter(this, bebidas, onClickBebidas())
        recyclerView.adapter = adapter
    }

    private fun onClickBebidas(): BebidasAdapter.BebidasOnClickListener{
        return object : BebidasAdapter.BebidasOnClickListener {
            override fun onClickBebidas(holder: BebidasAdapter.BebidasViewHolder?, idx: Int) {
            val bebida = (bebidas ?: emptyList()) [idx]
                Toast.makeText(this@BebidasActivity, "Bebida: ${bebida.nome}", Toast.LENGTH_LONG).show()
        }
    }
    }
}