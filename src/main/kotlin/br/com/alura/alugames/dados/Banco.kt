package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Jogo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


object Banco {
    fun obterConexao(): Connection? {
        return try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/alugames", "root", "2w3e4r5t6y7u8i9o")
        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }




}