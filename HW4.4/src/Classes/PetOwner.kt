package ru.tinkoff

class PetOwner(petType: Int, name: String) {
    lateinit var myPet: Pet

    init {
        when (petType) {
            1 -> myPet = Dog(name, 1)
            2 -> myPet = Cat(name, 1)
            3 -> myPet = Snake(name, 1)
            4 -> myPet = Parrot(name, 1)
            5 -> myPet = Fish(name, 1)
        }
        println("Pet name is: ${myPet.name} and pet age is ${myPet.age}")
    }

    fun feed() {
        myPet.eat()
    }

    fun clean() {
        if (!myPet.isFed) {
            println("There is nothing to clean")
        } else {
            myPet.isFed = false
            println("You cleaned after your pet")
        }
    }
}