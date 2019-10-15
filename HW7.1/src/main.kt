fun main() {
    val cat = Pet().apply {
        nickname = "Barsik"
        age = 2
        sex = "Male"
    }
    val dog: Pet = Pet().apply {
        nickname = "Rex"
        age = 1
        sex = "Male"
    }
    println(dog.respectableNickname)
    println(cat.respectableNickname)
    println(cat.isAdult())
    println(dog.isAdult())
}