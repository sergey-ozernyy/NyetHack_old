import java.time.DateTimeException
import java.util.*

fun main() {



class Task(_name: String,
            val id: Int = 0,
            var status: Boolean = false){
    var name = _name
        get()=field.capitalize()
    constructor(name: String): this(name){

    }

}

val task1 = Task("Разобраться с конструкторами в Kotlin")
}