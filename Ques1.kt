import Person.Companion.age
import Person.Companion.firstName
import Person.Companion.lastName

class Person {

    companion object {
        const val firstName = "Yashwant"
        const val lastName = "Vadali"
        const val age = 20
    }

    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0

    init {
        firstName = "Hello"
        lastName = "Vadali"
        age = 10
    }
}

fun main() {

    println("Details from Companion Object:- ")
    println("First Name: $firstName, Last Name: $lastName, Age: $age\n")

    val person = Person()
    println("Details from Init Block:- ")
    println("First Name: ${person.firstName}, Last Name: ${person.lastName}, Age: ${person.age}")
}
