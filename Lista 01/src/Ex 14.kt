fun main(){
    fun aumento(a:Double) = a + (a * 0.15)
    print("Digite o salario atual: R$ ")
    val valor = readln().toDouble()
    val novo_sal = aumento(valor)

    println("O valor com desconto é: R$ $novo_sal")
}
