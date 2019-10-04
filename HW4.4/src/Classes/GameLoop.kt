package ru.tinkoff

import java.io.IOException
import java.util.*

class GameLoop {
    private val scn = Scanner(System.`in`)
    fun run(owner: PetOwner){
        scn.reset()
        do {
            println("Choose action:")
            println("1.Feed")
            println("2.Clean")
            try{
                when(scn.nextInt()){
                    1->owner.feed()
                    2->owner.clean()
                    else -> throw IOException()
                }
            }catch (e: InputMismatchException){
                scn.next()
                continue
            }catch (e: IOException){
                continue
            }

        }while(!owner.myPet?.isGone!!)

    }
}