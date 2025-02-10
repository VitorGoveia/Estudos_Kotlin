fun main(){
    fun promocional(a:Double) = a - (a * 0.05)
    print("Digite o valor inteiro: R$ ")
    val valor = readln().toDouble()
    val descontado = promocional(valor)

    println("O valor com desconto é: R$ $descontado")
}