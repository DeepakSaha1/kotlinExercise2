import java.util.*

class Librarian : Library {
    private var name: String = ""
    private var id: Int = 0

    companion object {
        var bookscount = 0
    }

    override fun issueBooks() {
        val sc = Scanner(System.`in`)
        println("Enter Book Name : ")
        name = sc.next()
        println("Enter Book Id : ")
        id = sc.nextInt()
        bookscount++
        println("Total Books Issued: $bookscount")
    }

    override fun returnBooks() {
        println("books returned successfully")
        bookscount--
        println("Total Books Issued: $bookscount")
    }

    override fun showBooks() {
        println("Issued Book Name: $name")
        println("Issued Book Id: $id")
    }
}

interface Library {
    fun issueBooks()
    fun returnBooks()
    fun showBooks()
}

fun main() {
    val librarian = Librarian()
    loop@ while (true) {
        println("\n Menu")
        println("1.Issue books")
        println("2.Return books")
        println("3.Show book details")
        println("4.Exit")
        print("Enter choice: ")

        val sc = Scanner(System.`in`)
        val choice = sc.nextInt()
        when (choice) {
            1 -> librarian.issueBooks()
            2 -> librarian.returnBooks()
            3 -> librarian.showBooks()
            4 -> break@loop
        }
    }
}