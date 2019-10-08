package ru.tinkoff

data class Person(
    val lastName: String,
    val firstName: String,
    val age: Int,
    val zipCode: String,
    val phoneNumber: String
) {
    companion object : Comparator<Person> {
        override fun compare(o1: Person?, o2: Person?): Int {
            return if (o1?.firstName == o2?.firstName &&
                o1?.lastName == o2?.lastName &&
                o1?.age == o2?.age &&
                o1?.zipCode == o2?.zipCode &&
                o1?.phoneNumber == o2?.phoneNumber
            ) {
                println("${o1?.firstName} эквиватентно ${o2?.firstName}")
                1
            } else{
                println("${o1?.firstName} не эквиватентно ${o2?.firstName}")
                0
            }

        }
    }
}


object PersonComparator : Comparator<Person> {
    override fun compare(o1: Person?, o2: Person?): Int {
        return if (o1?.firstName == o2?.firstName &&
            o1?.lastName == o2?.lastName &&
            o1?.age == o2?.age &&
            o1?.zipCode == o2?.zipCode &&
            o1?.phoneNumber == o2?.phoneNumber
        ) {
            println("${o1?.firstName} эквиватентно ${o2?.firstName}")
            1
        } else {
            println("${o1?.firstName} не эквиватентно ${o2?.firstName}")
            0
        }
    }

}

fun main() {
    val personAndrey = Person("Orlov","Andrey",19,"390000","+77777777777")
    val personAndrey1 = Person("Orlov","Andrey",19,"390000","+77777777777")
    val personNotAndrey = Person("Orlov","Egor",19,"390000","+77777777777")
    PersonComparator.compare(personAndrey,personAndrey1)
    PersonComparator.compare(personAndrey,personNotAndrey)

    Person.compare(personAndrey,personAndrey1)
    Person.compare(personAndrey,personNotAndrey)
}
