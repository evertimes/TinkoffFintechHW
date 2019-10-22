class Pet(var nickname: String, var age: Int, var sex: String?)

fun Pet.isAdult() = this.age >= 2

val Pet.respectableNickname: String
    get() {
        return "Dear, ${this.nickname}"
    }