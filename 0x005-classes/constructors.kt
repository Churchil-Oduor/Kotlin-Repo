fun main()
{
    var Car = Vehicle("Prado" , 340.98)
    println(Car)
}

class Vehicle (
    var name: String,
    var price: Double,
    var inStock: Boolean = false
) {

    constructor(): this("", 0.0)
    fun whoami(){
        println("Hey I am $name model. I got at $price and our status in stock is $inStock")
    }

    //enables you to get the details of the object
    override fun toString() : String {
        return "I am a $name"
    }
}