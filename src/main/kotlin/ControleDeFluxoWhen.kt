fun main() {
    val tipoPessoa: Int = 3;

    var tipoPessoaEscolhida = when(tipoPessoa) {
        1 -> "Razão Social: Comercio XYZ - CNPJ: 123"
        2 -> "Nome: José - CPF: 123"
        else -> {
            "Desconhecido"
            "Não Encontrado"
        }
    }

    println(tipoPessoaEscolhida)

    var idade = 15;

    when {
        idade > 18 -> println("Você é maior de idade")
        idade <= 60 && idade > 15 -> println("Você não é idoso, não vou te aposentar.")
        idade > 60 -> print("Toma sua aposentadoria")
        else -> print("Tu nem nasceu")
    }

}
