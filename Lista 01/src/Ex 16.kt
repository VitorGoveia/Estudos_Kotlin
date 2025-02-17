fun main(){
    print("Quantos dias foram trabalhados nesse mês? ")
    val Dias = readln().toInt()

    val Horas_Trabalhadas = Dias*8
    val Salario_Final = Horas_Trabalhadas*25.00
    val Salario_Final_format = String.format("%.2f", Salario_Final).toString()

    println("O trabalhador deve receber o salário de R$ $Salario_Final_format por seus $Dias dias trabalhados")

}

/**
 * Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
 * hora trabalhada.
 * */

