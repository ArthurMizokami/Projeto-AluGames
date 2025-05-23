package br.com.alura.alugames.modelo

import java.math.BigDecimal

class PlanoAssinatura(
    tipo: String,
    val mensalidade: BigDecimal,
    val jogosIncluidos: Int,
    val percentualDescontoReputacao: BigDecimal,
    override var id: Int = 0
): Plano(tipo) {
    override fun toString(): String {
        return "PlanoAssinatura: " +
                "Tipo: '$tipo'\n"
                "Mensalidade: $mensalidade \n" +
                        "JogosIncluidos: $jogosIncluidos\n " +
                        "Percentual Desconto Reputacao: $percentualDescontoReputacao\n" +
                        "Id: $id\n"
    }

    override fun obterValor(aluguel: Aluguel): BigDecimal {
        val totalJogosMes = aluguel.gamer.jogosDoMes(aluguel.periodo.dataInicial.monthValue).size+1

        return if(totalJogosMes <= jogosIncluidos) {
            BigDecimal.ZERO
        } else {
            var valorOriginal = super.obterValor(aluguel)
            if (aluguel.gamer.media > 8) {
                valorOriginal -= valorOriginal.multiply(percentualDescontoReputacao)
            }
            valorOriginal
        }
    }
    }
