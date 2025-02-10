fun main(){
    print("Digite quantos reais você tem: ")
    val real = readln().toDouble()

    val dolar = real/5.79
    val dolar_formatado = String.format("%.2f", dolar).toString()
    println("R$ $real equivale a US$ $dolar_formatado ")
}