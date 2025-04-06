class Tesoura {
    fun luta(elemento: String) : Int{
        if(elemento.equals("PEDRA")){
            println("Você perdeu!")
            return -1
        }
        if(elemento.equals("PAPEL")){
            println("Você ganhou!")
            return 1
        }
        println("Você empatou!")
        return 0
    }
}
