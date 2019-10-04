import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        println("Let's ride!")
        for(i in km downTo 0){
            //if(i%20==0){
                println("$i kilometers left")
            //}
        }
        println("We arrived!")
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}