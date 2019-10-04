package ru.tinkoff

class Fish(override val name:String,override val age:Int):Pet(),Swimable{
    override fun swim() {
        println("*Swimming*")
    }
}