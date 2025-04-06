
var playerList = mutableListOf<String>()
var scoreList = mutableListOf<Int>()

fun main() {
    do{
        println("\n1-JOGAR!")
        println("2-PLACAR")
        println("3-SAIR!")

        val opcao = readln()

        when(opcao.toInt()){
            1 -> jogar() 
            2 -> mostrarPlacar()
            3 -> print("saindo...")
        }
    }while(opcao != "0")
}

fun jogar(){
    var pontos = 0
    println("Digite seu nickname: ")
    val nickname = readln() 

    println("QUE OS JOGOS COMEÇEM!")
    var rodadas = 1
    do {
        println("O que você quer jogar? ")
        println("Pedra, papel ou tesoura?!")
        var jogada = readln().uppercase()

       
        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = computador()
        println("O computador jogou: $movimentoPC")

        when(jogada){
            "PEDRA" -> {
                pontos += pedra.luta(movimentoPC)
        }
            "PAPEL"-> {
                pontos += papel.luta(movimentoPC)
            }
            "TESOURA"-> {
                pontos += tesoura.luta(movimentoPC)
            }
        }
        println("Você tem: $pontos pontos!")
        println("Próxima rodada!")
        rodadas++ 
    }while(rodadas <= 3)
    playerList.add(nickname)
    scoreList.add(pontos)
}

fun computador(): String{
 
    val movimento = (1..3).random()
    when(movimento){
        1-> return "TESOURA"
        2-> return "PEDRA"
        3-> return "PAPEL"
        else -> return ""
    }
}

fun mostrarPlacar(){
    println("\n\n\n")
    println("PLAYER \t PONTOS")

    var i = 0
    for(player in playerList){
        
        println("$player \t ${scoreList[i]}")
        i++;
    }
}
