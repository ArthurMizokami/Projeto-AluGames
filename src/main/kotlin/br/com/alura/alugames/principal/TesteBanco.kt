package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco
import br.com.alura.alugames.dados.JogosDAO
import br.com.alura.alugames.modelo.Jogo
import java.math.BigDecimal


fun main() {
    val precoBigDecimal = BigDecimal.valueOf(9.99)
    val jogo = Jogo("God of War", "https://example.com/capas/godofwar.jpg", "Uma aventura épica com Kratos e seu filho Atreus.", precoBigDecimal)
    val jogoDAO = JogosDAO()

    jogoDAO.adicionarJogo(jogo)

    val listaJogos: List<Jogo> = jogoDAO.getJogos()
    println(listaJogos)
}