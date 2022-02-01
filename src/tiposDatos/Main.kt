package tiposDatos

fun main(){
    //Byte
    val age:Byte = 20
    val newAge:Byte = 30

    //Int
    val productID = 2147483847
    val productID2 = 2_147_483_747
    //val productID3:Int = 2_147_483_748

    //Long
    val userId:Long = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L

    //Double
    val myDouble = 2.12345678911234567
    println(myDouble)

    //Float
    val myFloat = 2.12345678911234567F
    println(myFloat)

    //Operaciones logicas
    /*
    *tipo  simbolo   kotlin
    *And     &&       and
    * Or     ||       or
    * Not     !       not
     */

    //Boolean
    val isLoggedIn = true
    val hasAddress = false

    //And
    /*
    *true && true = true
    *true && false = false
    *false && true = false
    *false && false = false
     */

    //Or
    /*
    *true || true = true
    *true || false = true
    *false || true = true
    *false || false = false
     */

    //Not
    /*
    *!true = false
    *!false = true
     */

    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress)
    println(!isLoggedIn)  //false
    println(isLoggedIn.not())

    //Secuencias de escape
    /*
    *\t
    *\n
    *\b
    *\r
     */

    //Char
    val keyInserted = 'a'
    println(keyInserted)
    println('\$')
    println('\'')
}