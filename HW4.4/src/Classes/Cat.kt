package ru.tinkoff

class Cat(override val name:String,override val age:Int):Pet(),Walkable,Voicable{
    override fun voice(){
        println("Meow")
    }
    override fun walk(){
        println("*Walking*")
    }
}