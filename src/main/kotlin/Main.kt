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




fun main()
{
    val persona1 = Oficinista()
    println(persona1.trabaja())
}