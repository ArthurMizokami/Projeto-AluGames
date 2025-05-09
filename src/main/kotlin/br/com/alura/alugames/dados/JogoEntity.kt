package br.com.alura.alugames.dados

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "jogos")
class JogoEntity(
    val titulo: String = "Título do jogo",
    val capa: String = "Capa do jogo",
    val descricao: String? = null,
    val preco: BigDecimal = BigDecimal(0),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = 0) {
}