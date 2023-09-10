import java.nio.file.DirectoryNotEmptyException

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")

        if (idade > 60) {
            println("terceira idade")
        }

    } else if (idade < 10) {
        println("Criança")
    } else {
        println("menor de idade")
    }

}

fun saudacao(dia: Boolean) = if (dia) {
    "bom dia"
} else {
    "boa noite"
}

fun main() {

    var num = 28

    if (num >= 30) {
        println("é maior ou igual a 30")
    } else {
        println("menor que 30")
    }

    maiorDeIdade(19)
    maiorDeIdade(16)
}
