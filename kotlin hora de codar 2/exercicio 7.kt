fun main() {
    val numeros = mutableListOf<Int>()
    var soma = 0

    for (i in 1..6) {
        println("Digite números inferiores a 72.")
        print("Digite o ${i}º número: ")
        val numero = readLine()!!.toInt()
        numeros.add(numero)

        if (numero < 72) {
            soma += numero
        }
    }
    println("Soma dos números menores que 72: $soma")
}
