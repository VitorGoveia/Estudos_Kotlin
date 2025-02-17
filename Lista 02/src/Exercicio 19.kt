fun main() {
    print("Digite o seu ano de nascimento: ")
    val Ano_nasc = readln().toInt()

    val Idade = 2025 - Ano_nasc

    if (Idade >= 18) print("hmm.. $Idade anos, Já pode votar") else print("Vai votar não, volte depois")
}
/**
 * Faça um programa que leia o ano de nascimento de uma pessoa,
 * calcule a idade dela e depois mostre se ela pode ou não votar.
 * */
