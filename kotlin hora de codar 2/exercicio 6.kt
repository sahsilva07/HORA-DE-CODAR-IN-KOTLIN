fun main() {
    val numeros = mutableListOf<Int>()

    for (i in 1..4) {
        println("Digite o ${i}º número:")
        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }

    val primeiro = numeros.first()
    val ultimo = numeros.last()
    val maior = numeros.max()

    println("Primeiro número digitado: $primeiro")
    println("Último número digitado: $ultimo")
    println("Maior número digitado: $maior")
}
