fun main()
{
    val students = mutableListOf(
        "Jack",
        "Peter",
        "Faith",
        "Kamau"
    )

    //destructing 
    val (std1 , std2, std3) = students
    println("$std1 $std2 $std3")
}