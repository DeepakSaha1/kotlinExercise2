

fun main() {

    val map = mutableMapOf<Int, Char>()

    for (i in 1..26) {
        map[i] = (96 + i).toChar()
    }

    for (i in map.keys) {
        println("Key: $i, Value: ${map[i]}")
    }
}
