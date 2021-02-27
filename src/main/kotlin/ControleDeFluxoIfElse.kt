fun main(){
    val idade: Int = 20;

    if(idade > 60) {
        println("Você pode usar vaga de idoso")
    } else if(idade > 70 && idade < 80) {
        println("Você pode usar um manobrista")
    } else {
        println("Você precisa estacionar longe...");
    }

    val maiorIdade = if (idade > 18) "Maior de idade" else "Menor de idade";
    println(maiorIdade)
}