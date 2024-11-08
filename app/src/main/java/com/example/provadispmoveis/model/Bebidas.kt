package com.example.provadispmoveis.model

data class Bebidas(val nome: String, val descricao: String, val img: String)

object BebidasData {
    fun getBebidas(): List<Bebidas> {
        return listOf(
            Bebidas("Espresso", "Um café forte e concentrado feito ao forçar água quente através de café \n" +
                    "moído fino. Base de várias outras bebidas de café.", "@drawable/expresso"),

            Bebidas("Cappuccino", "Combina espresso com partes iguais de leite vaporizado e espuma de \n" +
                    "leite. Famoso pelo equilíbrio entre sabores ricos e textura cremosa.", "@drawable/cappucino"),

            Bebidas("Latte", "Uma dose de espresso com uma quantidade generosa de leite vaporizado \n" +
                    "e uma pequena camada de espuma por cima. Suave e levemente \n" +
                    "adocicado. ", "@drawable/latte"),

            Bebidas("Americano", "Espresso diluído com água quente, resultando em um café mais suave e \n" +
                    "menos intenso. Popular entre quem gosta de sabores menos \n" +
                    "concentrados. ", "@drawable/americano"),

            Bebidas("Mocha", "Mistura de espresso com leite vaporizado e uma dose de chocolate. \n" +
                    "Geralmente coberto com chantilly e popular entre os amantes de \n" +
                    "chocolate. ", "@drawable/mocha"),

            Bebidas("Macchiato", "Espresso “manchado” com um pouco de espuma de leite, acentuando o \n" +
                    "sabor forte do café com apenas um toque de suavidade. ", "@drawable/macchiato"),

            Bebidas("Flat White ", "Similar ao cappuccino, mas com menos espuma e uma proporção maior \n" +
                    "de leite. De origem australiana, tem sabor intenso e textura sedosa. ", "@drawable/flatwhite"),

            Bebidas("Ristretto", "Uma dose de espresso mais concentrada e curta, com sabor mais denso \n" +
                    "e encorpado. Ideal para quem gosta de café intenso.", "@drawable/ristreto"),

            Bebidas("Affogato", "Uma sobremesa italiana que combina espresso quente sobre uma bola de \n" +
                    "sorvete de baunilha. Uma deliciosa fusão de quente e frio. ", "@drawable/affogato"),

            Bebidas("Cold Brew", "Café preparado com infusão em água fria por 12-24 horas, resultando em \n" +
                    "um sabor suave e menos ácido. Servido gelado. ", "@drawable/coldbrew"),
        )
    }
}