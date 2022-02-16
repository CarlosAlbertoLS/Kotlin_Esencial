package funciones

fun main() {
    val isvalid = isvalid (5){
        it > 10
    }
    println(isvalid)

    //Nav Component, Intent, Cambio de pantalla
    consultProductId (getOnNextProductIdBehavior())
}
fun isvalid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)

fun consultProductId(onNext: (productID: String) -> Unit) {
    //BD Api
    val  productId = "WERT123"
    onNext(productId)
}
fun getOnNextProductIdBehavior(): (productId: String) -> Unit {
    return {
        println("Go to product detail screen with product ID: $it")
    }
}