package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Periodo
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.servicos.ConsumoApi
import com.google.gson.GsonBuilder
import java.io.File
import java.math.BigDecimal
import java.time.LocalDate

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscarJogosJson()

    //println(listaGamers)

    val gamer1 = listaGamers.get(0)
    val jogo1 = listaJogoJson.get(0)
    val jogo2 = listaJogoJson.get(1)
    val jogo3 = listaJogoJson.get(2)
    val jogo4 = listaJogoJson.get(3)
    val jogo5 = listaJogoJson.get(4)
    val jogo6 = listaJogoJson.get(5)
    val jogo7 = listaJogoJson.get(6)
    val jogo8 = listaJogoJson.get(7)
    val jogo9 = listaJogoJson.get(8)
    val jogo10 = listaJogoJson.get(9)

    val periodo7Dias = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    val periodo10Dias = Periodo(LocalDate.now(), LocalDate.now().plusDays(10))
    val periodo30Dias = Periodo(LocalDate.now(), LocalDate.now().plusDays(30))
    val periodo4 = Periodo(LocalDate.of(2023,8,2), LocalDate.of(2023,8,15))

    val gamer2 = listaGamers.get(1)
    gamer2.plano = PlanoAssinatura("PRATA", BigDecimal.valueOf(9.90), 3, BigDecimal(0.15))
    gamer2.alugajogo(jogo2, periodo7Dias)
    gamer2.alugajogo(jogo1, periodo10Dias)
    gamer2.alugajogo(jogo3, periodo30Dias)
    gamer2.alugajogo(jogo4, periodo7Dias)
//    println(gamer2.jogosAlugados)

    gamer2.recomendar(1)
    gamer2.recomendar(10)
    gamer2.recomendar(9)
    //println(gamer2)

    gamer2.recomendarJogo(jogo2, 10)
    gamer2.recomendarJogo(jogo3, 8)
    gamer2.recomendarJogo(jogo4, 7)
    gamer2.recomendarJogo(jogo5,8)
    gamer2.recomendarJogo(jogo6,10)
    gamer2.recomendarJogo(jogo7, 6)
    gamer2.recomendarJogo(jogo8, 8)
    gamer2.recomendarJogo(jogo9, 9)
    gamer2.recomendarJogo(jogo10,6)

    val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    val serializacao = gson.toJson(gamer2.jogosRecomendados)
    println(serializacao)

    val arquivo = File("jogosRecomendados.${gamer2.nome}.json")
    arquivo.writeText(serializacao)
    println(arquivo.absolutePath)

//    println(gamer2.jogosAlugados)
//    println(gamer2.jogosRecomendados)


}