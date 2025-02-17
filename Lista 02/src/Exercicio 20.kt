fun Coleta_Media(nota1: Double, nota2: Double) = (nota1 + nota2)/2

fun main() {
    print("Digite o nome do aluno: ")
    val nome = readln()
    print("Primeira Nota: ")
    val nota1 = readln()!!.toDouble()
    print("Segunda Nota: ")
    val nota2 = readln()!!.toDouble()
    val media = Coleta_Media(nota1, nota2)
    val media_format = String.format("%.2f", media).toString()

    print("O aluno $nome teve uma média de $media_format, com um aproveitamento: ")
    if(media>7.0) print("Bom") else print("Ruim")
}

/**
 * Crie um algoritmo que leia o nome e as duas notas de um aluno,
 * calcule a sua média e mostre na tela. No final, analise a média e
 * mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
 * da média 7.0).
 * */
