open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}
class HomeCat():Cat(){
    fun hunt(isHunter:Boolean) {
        if(isHunter) super.hunt() else println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}

fun main() {
    val myCat = HomeCat()
    myCat.hunt(true)
    myCat.hunt(false)
}