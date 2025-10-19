fun main() {
    var opcao: Int
    var base: Double
    var altura: Double
    var lado: Double
    var dmaior: Double
    var dmenor: Double
    var bmaior: Double
    var bmenor: Double
    var raio: Double
    var area: Double

    println("=== Calculadora de Áreas ===")
    println("1 - Retângulo")
    println("2 - Quadrado")
    println("3 - Losango")
    println("4 - Trapézio")
    println("5 - Paralelogramo")
    println("6 - Triângulo")
    println("7 - Círculo")
    print("Escolha uma opção: ")
    opcao = readLine()?.toIntOrNull() ?: -1

    when (opcao) {
        1 -> {
            print("Digite a base: ")
            base = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a altura: ")
            altura = readLine()?.toDoubleOrNull() ?: 0.0
            area = base * altura
            println("A área do retângulo é: $area")
        }
        2 -> {
            print("Digite o lado do quadrado: ")
            lado = readLine()?.toDoubleOrNull() ?: 0.0
            area = lado * lado
            println("A área do quadrado é: $area")
        }
        3 -> {
            print("Digite a diagonal maior: ")
            dmaior = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a diagonal menor: ")
            dmenor = readLine()?.toDoubleOrNull() ?: 0.0
            area = (dmaior * dmenor) / 2
            println("A área do losango é: $area")
        }
        4 -> {
            print("Digite a base maior: ")
            bmaior = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a base menor: ")
            bmenor = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a altura: ")
            altura = readLine()?.toDoubleOrNull() ?: 0.0
            area = ((bmaior + bmenor) * altura) / 2
            println("A área do trapézio é: $area")
        }
        5 -> {
            print("Digite a base: ")
            base = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a altura: ")
            altura = readLine()?.toDoubleOrNull() ?: 0.0
            area = base * altura
            println("A área do paralelogramo é: $area")
        }
        6 -> {
            print("Digite a base: ")
            base = readLine()?.toDoubleOrNull() ?: 0.0
            print("Digite a altura: ")
            altura = readLine()?.toDoubleOrNull() ?: 0.0
            area = (base * altura) / 2
            println("A área do triângulo é: $area")
        }
        7 -> {
            print("Digite o raio: ")
            raio = readLine()?.toDoubleOrNull() ?: 0.0
            area = Math.PI * raio * raio
            println("A área do círculo é: $area")
        }
        else -> {
            println("Opção inválida!")
        }
    }
}
