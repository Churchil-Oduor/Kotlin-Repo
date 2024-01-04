fun main()
{
    val names = arrayOf<String>(
        "Churchil", "Okech", "Oduor", 
    )

    println(names[0])
    println(names[1])
    names[1] = "Victor"
    println(names.contentToString()) //prints the Array.
    println("Size of Array is ${names.size}")

    if ("Hope" in names)
        println("Hope is in the names")
    else
        println("Hope is not in the names!!")

    //To create an array of Nulls we proceed as follows
    val ArrayofNulls = arrayOfNulls<String>(5)
    println(ArrayofNulls.contentToString())

    //to fill the array
    ArrayofNulls.fill("$")
    ArrayofNulls[1] = "Sardines"
    println(ArrayofNulls.contentToString())
  


}
