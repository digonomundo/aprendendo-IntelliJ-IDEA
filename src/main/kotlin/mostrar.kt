fun  main (){
   val str = "Programação Kotlin."

    println("tamanho da string: ${str.length}")

    println("posição da (index) 0 string: ${str[0]}" )
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2,  5))
    println(str.replace( "Kotlin",  "kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())

    println("                      meu nome é             ".trim())

}