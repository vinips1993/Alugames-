import br.com.alura.alugames.modelo.Gamer

fun main (){
    val gamer1 = Gamer(
        "Vinicius",
        "vinicius@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Pedro",
        "pedro@email.com",
        "22/04/1993",
        "pedrop")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "01/02/2000"
        it.usuario = "vinij"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
}