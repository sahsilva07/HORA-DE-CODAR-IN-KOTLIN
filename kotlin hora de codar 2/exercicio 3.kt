fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    val maior = if (num1 > num2 && num1 > num3) {
        num1
    } else if (num2 > num1 && num2 > num3) {
        num2
    } else {
        num3
    }

    println("O maior número é: $maior")
}
