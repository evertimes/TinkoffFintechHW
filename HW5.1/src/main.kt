package ru.tinkoff

data class Person(val lastName:String, val firstName:String, val age:Int, val zipCode:String, val phoneNumber:String)
fun main() {
    val personAndrey = Person("Orlov","Andrey",19,"390000","+77777777777")
    val personAndrey1 = Person("Orlov","Andrey",19,"390000","+77777777777")
    val personNotAndrey = Person("Orlov","Egor",19,"390000","+77777777777")
    if(personAndrey == personAndrey1)
        println("${personAndrey.firstName} идентичен ${personAndrey1.firstName}")
    else
        println("${personAndrey.firstName} не идентичен ${personAndrey1.firstName}")
    if(personAndrey == personNotAndrey)
        println("${personAndrey.firstName} идентичен ${personNotAndrey.firstName}")
    else
        println("${personAndrey.firstName} не идентичен ${personNotAndrey.firstName}")
}