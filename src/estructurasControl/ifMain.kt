package estructurasControl

fun main() {
    val hasAddress = false
    val isLoggedIn = true

    // if user is logged in
        //if hasAddress
            //Mostrar lista de direcciones
        //!hasAddress
            //El usuario no tiene direcciones
    //use is not logged in
        //usuario no logeado
    if (isLoggedIn) {
        println("Usuario esta logeado")
        if (hasAddress){
            println("Mostrar lista de direcciones")
        }else {
            println("El usuario no tiene lista de direcciones")
        }
    }else {
        println("Usuario no logeado")
    }

    val userLoggedInStatus = if (isLoggedIn) "Logeado" else "No logeado"
    println(userLoggedInStatus)
}