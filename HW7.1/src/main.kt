fun main() {
    val cat = Pet("Barsik", 2, "Male")
    val dog = Pet("Rex", 1, "Male")
    println(dog.respectableNickname)
    println(cat.respectableNickname)
    println(cat.isAdult())
    println(dog.isAdult())
}