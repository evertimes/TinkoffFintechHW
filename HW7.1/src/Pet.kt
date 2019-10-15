class Pet {
    lateinit var nickname: String
    var age: Int = 0
    lateinit var sex: String
}

fun Pet.isAdult(): Boolean {
    return this.age >= 2
}

val Pet.respectableNickname: String
    get() {
       return "Dear, ${this.nickname}"
    }