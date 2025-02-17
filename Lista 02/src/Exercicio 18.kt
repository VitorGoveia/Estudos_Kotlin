fun main(){
    print("Digite a velocidade do carro (em KM/H): ")
    val velocidade_Carro = readln().toDouble()

    if (velocidade_Carro > 80){
        println("Você foi multado!")
        val valor_multa = (velocidade_Carro-80)*5
        println("Valor da multa: $valor_multa")
    }else{
        print("Tudo certo!")
    }
}

/**
 * Escreva um programa que pergunte a velocidade de um carro.
 * Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
 * foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
 * cada Km acima da velocidade permitida.
 * */