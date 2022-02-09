package arrays

fun main() {
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