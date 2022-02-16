package iterations

fun main() {
    println("MUTABLE LIST")
    val list = listOf(1,2,3)
    val anotherMutableList = list.toMutableList()

    val mutableList = mutableListOf(1,2,2,3)
    mutableList.add(4)
    mutableList[2] = 3
    mutableList.removeAt(3)

    mutableList.forEach {
        println(it)
    }

    println()
    println("MUTABLE SET")

    val mutableSet = mutableSetOf(1,2,2,3)
    mutableSet.forEach {
        println(it)
    }

    println()
    println("MUTABLE MAP")

    val mutableMap = mutableMapOf(
        1 to "Carlos",
        2 to "Alberto",
        3 to "Carlitos"
    )
    mutableMap[4] = "Andres"
    mutableMap.forEach {
        val item = it.key
        val name = it.value
        println("$item. $name")
    }
}