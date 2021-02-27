fun main() {
    helloWorld();
    println(retInteiro())
    println(concatenaNome("Renato", "Henrique"));
}

fun helloWorld() {
    println("Olá mundo")
}

fun retInteiro(): Int {
    var i = 10;
    return i;
}

fun concatenaNome(nome: String, sobrenome: String): String {
    return "$nome $sobrenome";
}