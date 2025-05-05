import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Arthur", "email@email.com")


    val gamer2 = Gamer("Luiz", "email2@email.com", "01/01/1991", "Luiz1991")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "02/02/2002"
        it.usuario = "Skywalker"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
}