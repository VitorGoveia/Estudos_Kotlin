fun main (){
    print("Digite um número: ")
    val num = readln().toInt()
    val antecessor = num-1
    val sucessor = num+1

    println("O antecessor de $num é $antecessor")
    println("O sucessor de $num é $sucessor")
}