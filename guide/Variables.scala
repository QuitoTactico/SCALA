class Person(val nombre: String) {  // crear clases
  def hello(): Unit = {             // aunque hay una sección especial para eso
    println(s"Hiiii, i'm $nombre.")
  }
}


object Variable extends App {
    val PI = 3.1415926535   // val son constantes, "VALORES"
    var num = 70            // var son variables, lo normal
    var num2 : Int = 90     // eso reconoce el tipo normalmente, pero puedes especificarlo
    
    val person = new Person("Juan")     // instanciar clases
    person.hello()
}