
import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter an array of integers:- ")
    val mSet = reader.nextLine().split(" ").toSet()

    println("Unique Elements:-")
    for (item in mSet)
        print("$item ")
    println()
    reader.close()
}
