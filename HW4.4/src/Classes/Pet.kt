package ru.tinkoff

abstract class Pet {
    abstract val age: Int
    abstract val name: String
    var isFed = false
    var isGone = false
    private fun runAway(){
        println("Your pet is gone!")
        isGone=true;
    }
    fun eat(){
        if (isFed){
            this.runAway()
        }else{
            isFed = true
            println("Now the pet is fed")
        }
    }
    fun sleep(){
        println("sleeping")
    }
    fun clean(){
        println("clean")
    }
}