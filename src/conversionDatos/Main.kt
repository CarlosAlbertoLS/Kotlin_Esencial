package conversionDatos

fun main() {
    /*Metodos de conversion
    *toDouble()
    * toFloat()
    * toLong()
    * toInt()
    * toChar()
    * toShort()
    * toByte()
     */

    val productLowStock:Byte = 20
    val productStock:Int = productLowStock.toInt()
    println(productStock)

    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println("El numero en byte es: $numberByte")


    val numberDouble= numberString.toDouble()
    println("El numero en double es: $numberDouble")

    val unicodeInt = 0x2764
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()
    println(unicode)

}