package br.com.alura.alugames.dados

import br.com.alura.alugames.dados.Banco.obterConexao
import br.com.alura.alugames.modelo.Jogo

class JogosDAO {
    fun getJogos(): List<Jogo> {
        val listaJogos = mutableListOf<Jogo>()
        val conexao = Banco.obterConexao()

        if (conexao != null) {
            try {
                val statement = conexao.createStatement()
                val resultado = statement.executeQuery("SELECT * FROM JOGOS")

                while (resultado.next()) {
                    val id = resultado.getInt("id")
                    val titulo = resultado.getString("titulo")
                    val capa = resultado.getString("capa")
                    val descricao = resultado.getString("descricao")
                    val preco = resultado.getBigDecimal("preco")

                    val jogo = Jogo(titulo, capa, descricao, preco, id)
                    listaJogos.add(jogo)
                }


                statement.close()
            } finally {
                conexao.close()
            }
        }

        return listaJogos

    }

    fun adicionarJogo(jogo: Jogo) {
        val conexao = Banco.obterConexao()
        val insert = "INSERT INTO JOGOS (TITULO, CAPA, DESCRICAO, PRECO) VALUES (?, ?, ?, ?)"

        if(conexao != null) {
            try {
                val statement = conexao.prepareStatement(insert)
                statement.setString(1,jogo.titulo)
                statement.setString(2, jogo.capa)
                statement.setString(3, jogo.descricao)
                statement.setBigDecimal(4, jogo.preco)
                statement.executeUpdate()
                statement.close()


            } finally {
                conexao.close()
            }
        }

    }
}