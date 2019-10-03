package ru.tinkoff

import java.util.*

class MainMenu {
    private val scn = Scanner(System.`in`)
    //private var pet:Pet? = null
    private var petType:Int=0
    fun init(owner: PetOwner){
        var petType:Int=0
        scn.reset()
        println("Choose your Pet:")
        println("1.Dog")
        println("2.Cat")
        println("3.Snake")
        println("4.Parrot")
        println("5.Fish")
        try {
            petType = scn.nextInt()
            if(petType>5 || petType<1)
                throw InputMismatchException()
        } catch (e: InputMismatchException) {
            scn.next()
            println("Please, enter correct number");
            return
        }
        println("Please, enter pet name")
        scn.reset()
        val name:String = scn.next()
        when(petType){
            1 -> owner.myPet = Dog(name,1)
            2 -> owner.myPet = Cat(name,1)
            3 -> owner.myPet = Snake(name,1)
            4 -> owner.myPet = Parrot(name,1)
            5 -> owner.myPet = Fish(name,1)

        }
    }
    fun gameLoop(owner: PetOwner){
        scn.reset()

        do {
            println("Choose action:")
            println("1.Feed")
            println("2.Clean")
            when(scn.nextInt()){
                1->owner.feed()
                2->owner.clean()
            }
        }while(!owner.myPet!!.isGone)

    }
}