fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()
    
    val numeros = listOf(num1, num2, num3).sortedDescending()

    val somaDosMaiores = numeros[0] + numeros[1]

    println("A soma dos dois maiores números é: $somaDosMaiores")
}
