class A {
    fun add(a: Int, b: Int): Int = a + b
    fun add(a: Double, b: Double): Double = a + b
    fun multiply(a: Int, b: Int): Int = a * b
    fun multiply(a: Double, b: Double): Double = a * b
    fun concat(a: String, b: String): String = a + b
    fun concat(a: String, b: String, c: String): String = a + b + c
}

fun main() {

    val a = A()
    println("Adding 2 Integers:- ${a.add(4, 7)}")
    println("Adding 2 Doubles:- ${a.add(4.535, 7.232)}")
    println("Multiplying 2 Integers:- ${a.multiply(4, 7)}")
    println("Multiplying 2 Doubles:- ${a.multiply(4.342, 7.2342)}")
    println("Concatenating 2 Strings:- ${a.concat("Hello", " World")}")
    println("Concatenating 3 Strings:- ${a.concat("Hello", " Android", " World")}")
}
