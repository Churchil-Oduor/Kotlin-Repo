/**
 * main - function that shows us kotlin's
 * TypeInference feature in action.
 * 
 */
fun main()
{
    /*
    We don't have to include the type of the variables
    Kotlin will do that for us. 
    */
    var country = "Kenya"
    var governors = 42
    var population = 27878L
    var independent = true
    var employment_rate = 90.78F
    var birth_rate = 77.990
    var signature = 'A'

    var message: String = """My Country is ${country}. A land comprising of ${governors} governors with
    a population size of ${population}. Our employment rate is ${employment_rate} and we have a birthrate of
    ${birth_rate}. Kenya ranks ${signature}"""

    println(message)
}