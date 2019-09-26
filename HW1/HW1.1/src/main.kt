import java.util.*

fun main(){
    try {
        val scn = Scanner(System.`in`)
        println("Please,enter name")
        val name:String = scn.nextLine()
        println("Please, enter 1st number")
        val n1 = scn.nextInt();
        println("Please, enter 2nd number")
        val n2 = scn.nextInt();
        println("$name получает $n1 через $n2 лет");
    } catch (e: Exception) {
        println("Exception!")
    }

}