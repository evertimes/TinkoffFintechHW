package ru.tinkoff

import java.io.IOException
import java.util.*

class MainMenu {
    private val scn = Scanner(System.`in`)
    fun init():PetOwner{
        do {
            var petType:Int
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
                    throw Exception("Incorrect selection")
            } catch (e: InputMismatchException) {
                scn.next()
                println("Please, enter correct number")
                continue
            }catch (e:Exception){
                println("Please, enter correct number")
                continue
            }
            println("Please, enter pet name")
            scn.reset()
            val name:String = scn.next()
            return PetOwner(petType,name)
        }while (true)

    }

}