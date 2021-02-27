fun main(args: Array<String>) {
    var nome: String            = args[0];
    var matricula: String       = args[1];

    var notaSomada: Float       = 0F;
    var contador                = 0;
    for((index,nota) in args.withIndex()) {
        if(index <= 1) continue;
        contador+=1;
        notaSomada += nota.toFloat();
    }

    var media                   = calculaMedia(notaSomada, contador);
    println("Média do aluno $nome ($matricula): $media");

}

fun calculaMedia(notaTotal: Float, contador: Int): Float {
    return (notaTotal) / contador;
}