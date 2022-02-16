package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )

    //n primeros elementos
    val breakFats = superMarket
        .take(3)
        .filterNot {
            it == "Eggs"
        }
    println(breakFats.joinToString())

    //n ultimos elementos
    val dinnerList = superMarket.drop(3)
    println(dinnerList.joinToString())
}