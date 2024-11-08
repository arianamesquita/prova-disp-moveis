package com.example.provadispmoveis.model

data class Cardapio(val nome: String)

object CardapioData {
    fun getCardapio(): List<Cardapio> {
        return listOf(
            Cardapio("Bebidas"),
            Cardapio("Comidas"),
            Cardapio("Mercearia")
        )
    }
}
