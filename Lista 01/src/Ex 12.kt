fun main(){
    print("Digite o valor de A: ")
    var valor_A = readln().toDouble()
    print("Digite o valor de B: ")
    var valor_B = readln().toDouble()
    print("Digite o valor de C: ")
    var valor_C = readln().toDouble()

    var delta = (valor_B*valor_B - (4 * valor_A * valor_C))

    var delta_formatado = String.format("%.2f", delta).toString()

    println("Dado os números o valor de delta é: $delta_formatado")
}