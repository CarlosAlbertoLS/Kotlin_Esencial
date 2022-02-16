package funciones

fun main() {
    //"My Fabulous App" -> "**** My Fabulous App ****"
    //"Welcome the best experience" -> "** Welcome the best experience **"
    //"CarlosALS" -> "* CarlosALS *"

    val appName = "My Fabulous App"
    val appFormatted = addStarsFormat(appName,4)
    println(appFormatted)

    val welcome = "Welcome the best experience"
    println(addStarsFormat(welcome,3))

    val name = "CarlosALS"
    println(addStarsFormat(name,1))
    println(addstarsFormat(name))
}

fun addStarsFormat(text: String, starNumber: Int): String {
    val textBuilder = StringBuilder(text)
    textBuilder.insert(0," ")
    textBuilder.insert(textBuilder.length, " ")
    for (i in 0 until starNumber) {
        textBuilder.insert(0,"*")
        textBuilder.insert(textBuilder.length,"*")
    }
    return textBuilder.toString()
}

fun addstarsFormat(text: String) = addStarsFormat(text, 2)