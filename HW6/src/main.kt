class Pet {
    lateinit var nickname: String
    var age: Int = 0
    lateinit var sex: String
}

fun main() {
    val dog = Pet().apply {
        nickname = "Rex"  //apply подходит для тех случев
        age = 10          //когда необходимо инициализировать
        sex = "Male"      //объект при создании.
    }
    val cat = with(Pet()) {
        nickname = "Barsik"//With подходит для тех случаев
        age = 5            //когда необходимо просто задать
        sex = "Male"       //значения нескольких полей созданного объекта
        this
    }
    val parrot = Pet().let {
        it.nickname = "Kesha"
        it.age = 5
        it.sex = "Male"
        it
    }
    val fish = Pet().also {
        it.nickname="Nemo"
        it.age = 2
        it.sex = "Male"
    }
    println(dog.nickname)
    println(cat.age)
    println(parrot.sex)
    println(fish.nickname)
}
