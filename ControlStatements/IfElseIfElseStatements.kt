fun main()
{
    val name = "Churchil"
    val age = 24
    val limit =  18
    val isCadet = false

    if (age >= limit && isCadet)
        println("${name} Can Join the Airforce")
    else if(age < limit && isCadet)
        println("${name} Is UnderAge by ${limit - age} years!")
    else if (!isCadet)
        println("Candidate should apply to be Cadet")
    else
        println("An Error Occurred!")

    println("Analysis Complete!!")
}