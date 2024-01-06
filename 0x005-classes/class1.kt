class Vehicle
{
    var brand = ""
    var price = 0.00
    fun whoami()
    { println("Hey there!, I am a $brand and I cost $price !!")}

}

fun main()
{
    val prado = Vehicle()
    prado.brand = "Prado"
    prado.price = 10000000000.8
    println(prado.whoami())
}