open class Pet {
    lateinit var nickname:String
    var age:Int = 0
    lateinit var sex:String
}

class Cat:Pet(){
    lateinit var furColor:String
}
fun Pet.isCat():String = "That's not for sure"
fun Cat.isCat():String = "Yes, it is cat"