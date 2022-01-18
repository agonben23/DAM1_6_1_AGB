open class Trabajador(){
    open fun trabaja(): String {
        return "Este trabajador está trabajando"
    }

    fun descansa():String{
        return "Este trabajador está descansando"
    }
}

class Oficinista() : Trabajador(){
    override fun trabaja(): String {
         return "${super.trabaja()} en su oficina"
    }
}

class Obrero(): Trabajador(){
    override fun trabaja(): String {
        return "${super.trabaja()} en la obra"
    }
}

interface FiguraGeometrica {
    val forma : String
    val extension: Int
    fun mostrarInfo() : String
}

class Cuadrado(override val extension : Int) :FiguraGeometrica{
    override val forma = "cuadrada"

    override fun mostrarInfo(): String{
        return "Esta figura geométrica es $forma y tiene una extensión de $extension"
    }
}

class Triangulo(override val extension : Int) :FiguraGeometrica{
    override val forma = "triangular"

    override fun mostrarInfo(): String{
        return "Esta figura geométrica es $forma y tiene una extensión de $extension"
    }
}



fun main()
{
    var persona1 : Trabajador
    persona1 = Oficinista()
    println(persona1.trabaja())
    persona1 = Obrero()
    println(persona1.trabaja())

    var forma1: FiguraGeometrica
    forma1 = Cuadrado(5)
    println(forma1.mostrarInfo())
    forma1 = Triangulo(5)
    println(forma1.mostrarInfo())
}

/*
Respuestas a las preguntas de teoría

c. En el primer caso es una herencia de especialización , y en el segundo caso de especificación

d. En el primer caso la clase padre es Trabajador y las clases hijas son Oficinista y Obrero.
En el segundo caso la "clase" padre es la interfaz FiguraGeometrica y las clases hijas son Cuadrado y Triangulo.

e. En el primer caso, aunque no sea lo más óptimo , se podría introducir en la clase Trabajador como parámetro un string con el oficio del trabajador de manera que internamente la clase determinara a través de funciones lo que devuelve por pantalla.
En el segundo caso, al implementarlo con una interfaz, no pienso que exista otra manera de hacerlo que no sea a través de herencias.

f. En el primer caso trabajar con una herencia de especialización supone una ventaja, ya que en la función trabajase puede realizar una llamada a la función padre evitando así tener que volver a escribir a mano el mismo string en la función al tener ya una base sobre la que apoyarse a través de la llamada "super"
En el segundo caso trabajar con una interfaz es necesario, ya que sabemos las características que tienen las figuras geométricas (forma y extensión), pero varían dependiendo del tipo de figura geométrica de la que hablemos.
 */