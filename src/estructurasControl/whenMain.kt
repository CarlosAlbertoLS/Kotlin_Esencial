package estructurasControl

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true

    when(isLoggedIn) {
        true -> println("Usuario logeado")
        false -> println("Usuario no logeado")
    }

    //1  logged In
    //0  logged Out
    //-1 Down
    //10 - 20  Inactive time
    val userStatus = 17
    val userStatusString = when(userStatus) {
        0 -> "Logged Out"
        1 -> "Logged In"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus"
        else -> "Not Found"
    }
    println(userStatusString)

    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }
    println("totals: $total")

    val hasAddress = false
    val user = "CarlosALS"
    val message = when {
        isLoggedIn and hasAddress -> "Lista de direcciones de: $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else -> "Empty"
    }
    println(message)
}