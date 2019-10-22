open class Pet(val nickname:String,var age:Int,val sex:String?)

class Cat(nickname:String,age:Int,sex:String,var furColor:String) : Pet(nickname,age,sex)

fun Pet.isCat(): String = "That's not for sure"
fun Cat.isCat(): String = "Yes, it is cat"