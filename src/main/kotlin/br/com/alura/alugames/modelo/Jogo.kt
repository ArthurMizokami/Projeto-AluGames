package br.com.alura.alugames.modelo

import com.google.gson.annotations.Expose
import java.math.BigDecimal


data class Jogo(
    @Expose val titulo:String,
    @Expose val capa:String,
    @Expose var descricao:String? = null,
    @Expose var preco: BigDecimal = BigDecimal("0.0"),
    @Expose var id: Int? = null
): Recomendavel {

    constructor(titulo: String, capa: String, preco: BigDecimal, descricao: String):
            this(titulo, capa) {
                this.preco = preco
        this.descricao = descricao
            }

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao\n" +
                "Preço: $preco\n" +
                "Reputação: $media\n" +
                "Id: $id"

    }

    private val listaNotas = mutableListOf<Int>()

    override val media: Double
        get() = listaNotas.average()

    override fun recomendar(nota: Int) {
        if (nota < 1 || nota > 10) {
            println("Nota inválida. Insira uma nota entre 1 a 10")
        } else {
            listaNotas.add(nota)
        }
    }



}