    class Player(_name:String, val health:Int){
        val race = "DWARF"
        var town = "Bavaria"
        val name = _name
        val aligment: String
        private var age = 0
        
        init {
            println("initializing player")
            aligment = "GOOD"
        }
        
        constructor(_name:String): this(_name, 100) {
            town = "The Shire"
        }
        
    }
    
    
    fun main(args: Arrey<String>){
        Player("Madrigal")
    }
    
    
    
    
    
    
    
    
    

