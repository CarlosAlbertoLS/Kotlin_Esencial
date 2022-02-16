package funciones

fun main() {
    val user = "CarlosALS"
    showWelcomeMessage("Hola")
    showWelcomeMessage("Hi")
    showWelcomeMessage("Buenos días")
    
    //"Buenos días + nombre de usuario"
    showWelcomeMessage("welcome", user = user)
}

fun showWelcomeMessage(text: String, user: String = "") {
    val message = "$text $user".trim()
    println(message)
}