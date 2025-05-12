package br.com.alura.alugames.modelo

import java.math.BigDecimal

open class Plano(
    open val tipo: String,
    open val id: Int = 0) {

    override fun toString(): String {
        return "Plano(tipo='$tipo', id=$id)"
    }

    open fun obterValor(aluguel: Aluguel): BigDecimal {
        return aluguel.jogo.preco * aluguel.periodo.emDias.toBigDecimal()
    }
}