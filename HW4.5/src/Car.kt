import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        println("Поехали!")
        for(i in km downTo 0){
                println("Осталось $i киллометров")
        }
        println("Приехали!")
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}
