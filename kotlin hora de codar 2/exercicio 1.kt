fun main() {
    println("Digite o primeiro número:")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val numero2 = readLine()!!.toInt()

    if (numero1 > numero2) {
        println("O maior número é: $numero1")
    } else if (numero2 > numero1) {
        println("O maior número é: $numero2")
    } else {
        println("Os dois números são iguais: $numero1")
    }
}
