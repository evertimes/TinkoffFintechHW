package ru.tinkoff

class Fish(val name:String,val age:Int):Swimable,Pet(){
    override fun swim() {
        println("*Swimming*")
    }
}