fun main()
{
    val carBrands = listOf("Volvo", "Toyota", "Mercedes", "Benz")

    for (index in carBrands.indices)
        println("$index - ${carBrands[index]}")

    //printing in reversed
    for (index in carBrands.indices.reversed())
        println("$index - ${carBrands[index]}")
}