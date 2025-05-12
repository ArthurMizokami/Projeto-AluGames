package br.com.alura.alugames.modelo

import org.hibernate.criterion.Projections.id
import java.math.BigDecimal

class PlanoAvulso(
    tipo: String,
    override var id: Int = 0
): Plano(tipo) {
    override fun toString(): String {
        return "PlanoAvulso\n" +
                "Tipo: $tipo\n" +
        "Id: $id\n"
    }

    override fun obterValor(aluguel: Aluguel): BigDecimal {
        var valorOriginal = super.obterValor(aluguel)
        if (aluguel.gamer.media > 8) {
            valorOriginal -= valorOriginal.multiply(BigDecimal("0.1"))
        }
        return valorOriginal
    }

}
