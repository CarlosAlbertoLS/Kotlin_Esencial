package funciones

fun main() {
    val welcome = getWelcomeText()
    println(welcome)
    println(cleanText(welcome))
}

fun getWelcomeText(): String = "** Welcome the best experience **"

fun cleanText(text: String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()