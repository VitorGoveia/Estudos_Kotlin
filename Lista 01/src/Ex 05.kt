fun main(){
    print("Primeira Nota: ")
    var nota1 = readln()!!.toDouble()
    print("Segunda Nota: ")
    var nota2 = readln()!!.toDouble()
    var media = (nota1 + nota2)/2
    var media_formatado = String.format("%.2f", media).toString()

    println("A soma entre $nota1 e $nota2 é igual a $media_formatado")
}