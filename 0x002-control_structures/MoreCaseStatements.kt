fun main()
{
	val brand = "Ferrarid"
	
	// when can is used in the place of case statements 
	when
	{
		(brand == "Ferrari") -> println("From Ferrari Company")
		(brand == "Bugatii") -> println("From Bugatti Company")
		(brand == "Toyota") -> println("From Toyota Company")

		else -> println("Brand not found") //this line marks the default statement.
	}

	val age =  18

	when (age)
	{
		in 13..19 ->println("Is a Teenager!") // means "if age is in the range of 13 to 19 then ..."
		in 20..25 -> println("Is a young Adult") // similar to statement above
		else -> println("Is an Adult")
	}


}
