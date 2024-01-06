fun main()
{
    val students = mutableListOf(
        "Jack",
        "Peter",
        "Faith",
        "Kamau"
    )

    /* 
    In other languages, this is the paradigm that 
    is followed in destructuring of varuables
    val std1 = students[1]
    val std2 = student[2]
    val std3 = students[3]
    */
    //destructing syntax
    val (std1 , std2, std3) = students
    println("$std1 $std2 $std3")
}