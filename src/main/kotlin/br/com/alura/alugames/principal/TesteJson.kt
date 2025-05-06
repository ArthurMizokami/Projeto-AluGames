package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Periodo
import br.com.alura.alugames.servicos.ConsumoApi
import java.time.LocalDate

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscarJogosJson()

    println(listaGamers)

    val gamer1 = listaGamers.get(0)
    val jogo1 = listaJogoJson.get(7)

    println(gamer1)
    println(jogo1)

    val periodo = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))

    val aluguel = gamer1?.alugajogo(jogo1, periodo)
    println(aluguel)

}