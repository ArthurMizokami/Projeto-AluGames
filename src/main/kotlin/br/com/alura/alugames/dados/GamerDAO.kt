package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Gamer
import javax.persistence.EntityManager

class GamerDAO(val manager: EntityManager) {
    fun getGamers(): List<Gamer> {
        val query = manager.createQuery("FROM GamerEntity", GamerEntity::class.java)
        return query.resultList.map { entity ->
            Gamer(entity.nome, entity.email, entity.dataNascimento, entity.usuario, entity.id)
    }
}
