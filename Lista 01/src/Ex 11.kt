fun main(){
    print("Digite a largura: ")
    val largura = readln().toDouble()
    print("Digite a altura: ")
    val altura = readln().toDouble()

    var tinta = 2

    var area = largura*altura

    val tinta_neces = area/tinta
    val tinta_neces_format = String.format("%.0f", tinta_neces).toString()

    println("A area total a ser pintada é de $area")
    println("A quantidade de latas de tintas necessárias é $tinta_neces_format")
}