fun main() {
    val numeros = mutableListOf<Int>()

    for (i in 1..6) {
        println("Digite o ${i}º número:")
        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }

    println("Números informados: $numeros")

    val soma = numeros.sum()
    val media = soma / numeros.size.toDouble()

    println("A média aritmética é: $media")
}
