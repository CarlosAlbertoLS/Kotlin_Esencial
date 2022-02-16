package funciones

fun main() {
    //Declaración de lambda
    val printHola = {
        println("Hola Lambda")
    }
    val printText = {text: String ->
        println(text)
    }
    val addOneTo = {x: Int -> x + 1}
    val addFiveTo: (Int) -> Int = {
        it + 5
    }
    val sum: (Int, Int, String) -> Int ={
        x: Int, y: Int, _: String -> x+y
    }
    val sum2: (Int, Int, String) -> Int ={
        x: Int, y: Int, message: String ->
        val total = x+y
        println("$message $total")
        total
    }
    //Ejecución
    printHola()
    printText("Hola Lambda")
    println(addOneTo(4))
    println(addFiveTo(5))
    println(sum(5,3,""))
    println(sum2(5,3,"El resultado es: "))
}