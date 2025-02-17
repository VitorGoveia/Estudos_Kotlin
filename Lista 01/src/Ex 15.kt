fun main(){
    println("Qual a quantidade de Km percorridos na corrida? ")
    val Km = readln().toDouble()
    println("Quantos dias ele foi alugado: ")
    val Dias = readln().toInt()
    val Valor_Total = (Km*0.2)+(Dias*90.0)

    println("O valor total que será cobrado é $Valor_Total")
}

/**A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.*/

//UNIT retorna vazio

/**
for Sum(a: Int, b: Int): Unit{
    print(a+b)
}
 */
//un BhaskMenos(a: Double, b: Double, c: Double) = ((-1*b)+(Math.sqrt(((b*b)-4*a*c))))/(a*2)