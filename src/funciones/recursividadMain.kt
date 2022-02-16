package funciones

fun main() {
    val productPrices = doubleArrayOf(5.0, 3.0, 2.0)
    println(getProductPrices(productPrices, productPrices.size - 1))
}
//          0    1    2
//Precios {5.0, 3.0, 2.0}
fun getProductPrices(productPrices: DoubleArray, maxIndex: Int): Double {
    //Case Base
    if (maxIndex == 0) return productPrices[0]

    //Caso Recursivo
    return productPrices[maxIndex] + getProductPrices( productPrices, maxIndex - 1)
}