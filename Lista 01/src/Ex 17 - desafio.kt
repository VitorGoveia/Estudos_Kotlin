fun fun_dias_perdidos(anos: Double, cigarros:Double) = (((anos*365)*cigarros*10)/60)/24

fun main(){
    print("Quantos cigarros você fuma por dia? ")
    val cigarros_dia = readln().toDouble()

    print("Há quantos anos você fuma? ")
    val anos_fumando = readln().toDouble()

    val dias_perdidos = fun_dias_perdidos(anos_fumando, cigarros_dia)
    val dias_perdidos_format = String.format("%.0f", dias_perdidos).toString()

    println("Parabéns! Você já perdeu $dias_perdidos_format dias fumando cigarros")
}

/**
 * [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
 * de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
 * ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 * */
