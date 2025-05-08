package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco
import br.com.alura.alugames.dados.JogosDAO
import br.com.alura.alugames.modelo.Jogo
import java.math.BigDecimal


fun main() {
    val precoBigDecimal = BigDecimal.valueOf(9.99)
    val jogo = Jogo("God of War", "https://example.com/capas/godofwar.jpg", "Uma aventura épica com Kratos e seu filho Atreus.", precoBigDecimal)
    val jogo2 = Jogo("Halo Infinite", "https://example.com/capas/haloinfinite.jpg", "O retorno do Master Chief em uma nova saga.", precoBigDecimal)

    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    jogoDAO.adicionarJogo(jogo2)


    val listaJogos: List<Jogo> = jogoDAO.getJogos()
    println(listaJogos)

    manager.close()
}