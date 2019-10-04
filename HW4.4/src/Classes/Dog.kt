package ru.tinkoff

class Dog(override val name:String, override val age:Int) : Pet(), Walkable, Voicable, Swimable{
    override fun swim() {
        println("*swimming*")
    }

    override fun voice() {
        println("Bark")
    }

    override fun walk() {
        println("*walking*")
    }
}