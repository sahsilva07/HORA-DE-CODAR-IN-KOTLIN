fun main() {
    val numerosValidos = mutableListOf<Double>()

    var contador = 1
    while (numerosValidos.size < 4) {
        print("Digite o ${contador}º número (entre 0 e 10): ")
        val numero = readLine()!!.toDouble()

        if (numero > 0 && numero < 10) {
            numerosValidos.add(numero)
        } else {
            println("Número inválido. Digite um valor maior que 0 e menor que 10.")
        }

        contador++
    }

    val media = numerosValidos.sum() / numerosValidos.size

    println("\nMédia calculada: $media")

    if (media > 5) {
        println(" Parabens,Você passou no teste.")
    } else {
        println("Tente novamente.")
    }
}
