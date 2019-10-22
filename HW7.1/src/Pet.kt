class Pet(val nickname: String, var age: Int, val sex: String?)

fun Pet.isAdult() = this.age >= 2

val Pet.respectableNickname: String
    get() {
        return "Dear, ${this.nickname}"
    }