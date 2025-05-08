package br.com.alura.alugames.ultilitario

import br.com.alura.alugames.modelo.InfoJogoJson
import br.com.alura.alugames.modelo.Jogo
import java.math.BigDecimal

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, BigDecimal.valueOf(this.preco), this.descricao)
}