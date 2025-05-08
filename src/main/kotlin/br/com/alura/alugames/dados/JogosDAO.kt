package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Jogo
import javax.persistence.EntityManager

class JogosDAO(val manager: EntityManager) {
    fun getJogos(): List<Jogo> {
            val query = manager.createQuery("FROM JogoEntity", JogoEntity::class.java)
            return query.resultList.map { entity ->
                Jogo(entity.titulo, entity.capa, entity.descricao, entity.preco, entity.id)
            }
    }

    fun adicionarJogo(jogo: Jogo) {
        val entity = JogoEntity(jogo.titulo, jogo.capa, jogo.descricao, jogo.preco)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }
}