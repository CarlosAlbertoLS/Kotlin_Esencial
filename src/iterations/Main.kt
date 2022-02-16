package iterations

fun main() {
    println("LIST")

    val list = listOf(1,2,3)
    println(list[2])

    list.forEach {
        println(it)
    }

    println()
    println("SET")

    val set = setOf(1,2,2,3)
    println(set.size)
    set.forEach {
        println(it)
    }

    println()
    println("MAP")

    val map = mapOf(
        1 to "Carlos",
        2 to "Alberto",
        3 to "Carlitos"
    )
    map.forEach {
        val item = it.key
        val name = it.value
        println("$item. $name")
    }
}