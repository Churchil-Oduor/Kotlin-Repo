fun main()
{
    greet()
    addressedGreetings("Churchil")
}

/**
 * greet - greets you
 * 
 */

 fun greet()
 {
    println("Hello there!!")
 }

/**
 * addressedGreetings - greets a specific person
 * @name: your name
 */

 fun addressedGreetings(name: String)
 {
    println("Hello $name")
 }