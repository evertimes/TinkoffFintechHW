package ru.tinkoff

class Fish(val name:String,val age:Int):Swimable{
    override fun swim() {
        println("*Swimming*")
    }
}