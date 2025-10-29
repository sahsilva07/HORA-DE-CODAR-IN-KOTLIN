fun main() {
    // primeiro número
    print("Digite o primeiro número inteiro: ")
    val n1 = readLine()!!.toInt()

    // segundo número
    print("Digite o segundo número inteiro: ")
    val n2 = readLine()!!.toInt()

    println("Escolha a operação:")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")

    val operacao = readLine()!!.toInt()

    // Calcula o resultado
    when (operacao) {
        1 -> println("Resultado da adição: ${n1 + n2}")
        2 -> println("Resultado da subtração: ${n1 - n2}")
        3 -> {
            if (n2 != 0) {
                println("Resultado da divisão: ${n1 / n2}")
            } else {
                println("Erro: divisão por zero não é permitida.")
            }
        }
        4 -> println("Resultado da multiplicação: ${n1 * n2}")
        else -> println("Operação inválida.")
    }
}
