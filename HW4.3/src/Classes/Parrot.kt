package ru.tinkoff

class Parrot(val name:String,val age:Int):Flyable,Voicable,Walkable,Pet(){
    override fun fly() {
        println("*flying*")
    }

    override fun walk() {
        println("*Walking*")
    }

    override fun voice() {
        println("*Trill*")
    }
}