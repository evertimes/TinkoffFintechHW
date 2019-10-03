package ru.tinkoff

class PetOwner {
    var myPet:Pet? = null
    fun feed(){
        try {
            myPet?.eat()
        }catch (e:NullPointerException){
            println("You dont have a pet!")
        }
    }
    fun clean(){
        try {
            myPet?.isFed=false
        }catch (e:NullPointerException){
            println("You dont have a pet!")
        }
    }
}