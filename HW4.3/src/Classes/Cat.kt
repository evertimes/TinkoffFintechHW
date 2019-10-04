package ru.tinkoff

class Cat(val name:String,val age:Int):Pet(),Walkable,Voicable{
    override fun voice(){
        println("Meow")
    }
    override fun walk(){
        println("*Walking*")
    }
}