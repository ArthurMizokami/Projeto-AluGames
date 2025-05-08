package br.com.alura.alugames.dados

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence


object Banco {
//    fun obterConexao(): Connection? {
//        return try {
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/alugames", "root", "2w3e4r5t6y7u8i9o")
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }

    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
        return factory.createEntityManager()

    }





}