package arrays

fun main() {
    val myArray = arrayOf(1, "hola", 2.5F, 1000L)
    println(myArray[1]) //se imprime el mensaje hola

    myArray[1] = "adios"
    println(myArray[1]) //Se altera el indice 1 por adios y se imprime

    val emptyArray = emptyArray<Int>()

    val myByteArray = byteArrayOf(1, 2, 3)
    val myIntArray = intArrayOf(4, 5, 6, 7)
    val arrayInt = IntArray(5)
    val arrayInt2 = IntArray(5, { i: Int -> i.inc() })
    arrayInt2.forEach {
        println(it)
    }

    val arrayBoolean = BooleanArray(3) {
        println(it)
        true
    }
    arrayBoolean.forEach {
        println(it)
    }
}