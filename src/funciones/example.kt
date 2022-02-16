package funciones

fun main() {
    /*Usar una función en el siguiente codigo ademas de usar cleanCode
    *fun main() {
    // Saludo + Introducción + Nombre

    //saludo: hola, hi, bienvenido, buenos días, hallo
    //introducción: mi nombre es, Puedes llamarme, Usualmente me llaman, Yo soy
    //Nombres: Carlos, Alberto, Carlitos, Beto

    val greetings = arrayOf("Hola", "Hi", "Bienbenido", "Buenos días", "Hallo")
    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("Carlos", "Alberto", "Carlitos", "Beto")

    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroduction = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexNames]}"
    println(phrase)
}
     */

    val greetings = arrayOf("Hola", "Hi", "Bienbenido", "Buenos días", "Hallo")
    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("Carlos", "Alberto", "Carlitos", "Beto")

    val randIndexGreeting = randText(greetings.size)
    val randIndexIntroduction = randText(introductions.size)
    val randIndexNames = randText(names.size)

    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexNames]}"
    println(phrase)
}
fun randText (number: Int): Int {
    val randomText = (Math.random() * number).toInt()
    return randomText.toInt()
}