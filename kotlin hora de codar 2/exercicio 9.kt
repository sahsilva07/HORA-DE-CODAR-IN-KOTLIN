fun main() {
    println("Digite o ano de nascimento:")
    val anoNascimento = readLine()!!.toInt()

    val anoAtual = 2025
    val idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Você poderá votar este ano.")
    } else {
        println("Você ainda não poderá votar este ano.")
    }
}
