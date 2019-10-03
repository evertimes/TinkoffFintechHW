package ru.tinkoff

class Fish(override val name:String,override val age:Int):Swimable,Pet(){
    override fun swim() {
        println("*Swimming*")
    }
}