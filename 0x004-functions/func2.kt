fun main()
{
    val num1 = 3
    val name1 = "Churchil"
    val name2 = "Okech"
    val num2 = 900
    val radius = 7.0

    println(sum(num1, num2))
    println(circumference(radius))

    //perfom destructuring
    val (n1, n2) = twoValues(name1, name2)
    println("My name is $n1 $n2")
    val (first, second, age) = threeValues("Churchil", "Okech", 3)
    println("My name is $first $second and I am $age years old")
}

/**
 * sum - sums up two numbers
 * @num1: first number.
 * @num2: second number.
 * return: sum of num1 and num2
 */
fun sum(num1: Int, num2: Int): Int = num1 + num2

/**
 * circumference - calculates the circumference of a circle.
 * @radius: radius of circle.
 * return: circumference.
 */

 fun circumference(radius: Double): Double = 3.142 * radius * radius

/**
 * twoValues - function that returns two values
 * @firstName: first argument
 * @secondName: second argument
 * return: return consists of two values
 */

 fun twoValues(firstName: String, secondName:String): Pair<String, String> =
    firstName to secondName
/**
 * threeValues - function that returns three values
 * @one - first
 * @two - second
 * @three - third
 * return: triple values
 */

 fun threeValues(one:String, two:String, three: Int): Triple<String, String, Int>
 {
    return Triple(one, two, three)
 }

