


fun main(){

    val casa = "casa"
    val carro = "carro"

    val response = orderOfStrings(casa, carro)
    println(response)
}


// tipo determinado para loops infinitos,
// impossivel retornar qualquer coisa
fun foreverNew(): Nothing {

    while(true){
        Thread.sleep(1000)
        println("foreverNew")

        //return -> erro
    }
}

// porem quando não determinado retorna unit
// unit é o mesmo que void, permite o retorno para paradas inteligentes
fun foreverClassic(){


    while(true){
        Thread.sleep(1000)
        println("foreverClassic")
        return
    }

}

fun orderOfStrings(valueOne: String, valueTwo: String): String{

    if( valueOne > valueTwo){
        return "primeira paalavra maior"
    }
    if( valueOne < valueTwo){
        return "segunda paalavra maior"
    }

    return "as duas palavras são identicas"
}