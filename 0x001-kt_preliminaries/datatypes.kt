fun main()
{
    var country :String = "Kenya"
    var governors: Int = 42
    var population: Long = 27878L
    var independent: Boolean = true
    var employment_rate: Float = 90.78F
    var birth_rate: Double = 77.990
    var signature: Char = 'A'

    var message: String = """My Country is ${country}. A land comprising of ${governors} governors with
    a population size of ${population}. Our employment rate is ${employment_rate} and we have a birthrate of
    ${birth_rate}. Kenya ranks ${signature}"""

    println(message)
}