fun main()
{
    val names : List<String> = listOf(
        "Churchil", 
        "Allan",
        "Wangbel",
        "Bently",
        "Buses"
    )

    if (names.contains("Brent"))
        println("Brent is in the list")
    else
        println("Brent is not in the names")

    println(names[0])
    println(names) // prints the contents in the list
    println(names.size) //prints the size total number of items in the list
    println(names.indexOf("Bently"))
    println(names.first()) // prints the first item in the list
    println(names.last()) //prints the last item in the list

    //The list above is read-only.No changes can be made to the list eg adding, removing or modifying contant in the list
    // To make changes, we use a mutable list
}