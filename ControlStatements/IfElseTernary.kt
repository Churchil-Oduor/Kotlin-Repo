fun main()
{
    var letter = 'F'
    var gender : String?
    var response : String

    gender = if (letter == 'F') "Female" else "Male"
    println(gender)

    
    response = 
        if (gender == "Male") "Is a Male"
        else if (gender == "Female") "Is a Female"
        else "Error Occurred in Server!!"
    println(response)


}