fun main() {

    calcano(2)
    caracteres("ruanzin")
    cubo(10)
    milhasKm(6f)
    trocaLetras("era uma vez um pintinho de uma perna só que foi ciscar e caiu")

}

fun calcano(anos: Int){
    println("$anos ano(s) equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 *24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 *60} segundos")

}

fun caracteres( str: String):Int{
    return str.length

}

fun cubo(numero:Int):Int{
    return numero * numero * numero

}

fun milhasKm( milhas: Float):Float{
    return milhas * 1.6f
}

fun trocaLetras(str: String){
    println( str.replace("A", "x").replace("a","x").lowercase())

}


