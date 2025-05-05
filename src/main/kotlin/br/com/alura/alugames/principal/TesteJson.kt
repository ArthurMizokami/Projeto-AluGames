package br.com.alura.alugames.principal

import br.com.alura.alugames.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscarJogosJson()

    println(listaGamers)

    val gamer1 = listaGamers.get(1)
    val jogo1 = listaJogoJson.get(1)

    println(gamer1)
    println(jogo1)


}