package ru.tinkoff

class Fish(val name:String,val age:Int):Pet(),Swimable{
    override fun swim() {
        println("*Swimming*")
    }
}