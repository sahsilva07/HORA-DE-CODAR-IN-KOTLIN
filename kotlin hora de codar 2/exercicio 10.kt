fun main() {
    var altura: Double
    var resultado: Double
    var opcao: Int

    println("Escolha o seu gênero:")
    println("Digite 1 para feminino ou 2 para masculino:")
    opcao = readLine()!!.toInt()

    println("Digite a sua altura (em metros):")
    altura = readLine()!!.toDouble()

    if (opcao == 1) {
        resultado = (62.1 * altura) - 44.7
        println("O seu peso ideal é: $resultado kg")
    } else {
        resultado = (72.7 * altura) - 58
        println("O seu peso ideal é: $resultado kg")
    }
}
