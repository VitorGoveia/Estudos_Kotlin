fun main(){
    print("Digite um valor: ")
    var numero1 = readln()!!.toDouble()
    print("Digite um valor: ")
    var numero2 = readln()!!.toDouble()
    var soma = numero1 + numero2
    var soma_formatado = String.format("%.2f", soma).toString()

    println("A soma entre $numero1 e $numero2 é igual a $soma_formatado")
}