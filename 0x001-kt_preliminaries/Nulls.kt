fun main()
{
    var name = null // this is not allowed in kt

    var name1: String? = null // Style followed if variable can contain Null values
    println(name1?.uppercase())
    
}