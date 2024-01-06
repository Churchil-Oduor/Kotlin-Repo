fun main()
{
    val items: List<String> = mutableListOf(
        "Volvo",
        "Bently",
        "Mercedes"
    )

    println(items.contains("Benz"))
    //items.add("Benz") // adds Benz to the list
    //items.remove("Bently") // Removes benz from the list

    if (items.contains("Benz"))
        println("Benz has been added to the car collection")
    else
        println("Benz has been removed from the Car collection")
    
    val emptyList = mutableListOf<Any>() //creates an empty list -> []
    emptyList.add("element")
    println(emptyList.isEmpty()) // returns false
    

    
}