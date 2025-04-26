

class Calculator(val x: Int, val y: Int, val op: Int) 
{
    
    fun mult(x: Int, y: Int) = x * y;
    fun sum(x: Int, y: Int) = x + y;
    fun sub(x: Int, y:Int) = x - y;
    fun divide(x: Int, y: Int) = x / y;
    fun modulus(x: Int, y: Int) = x % y;
    fun engine(): Int {
        val res: Int
        res = when (op){
            1 -> sum(x, y)
            2 -> sub(x, y)
            3 -> divide(x, y)
            4 -> mult(x, y)
            else -> modulus(x, y)
        }

        return res;
    }
}


/**
 * ask_input - this code asks for the user input
 * Return: returns index correlating to user input
 */
fun ask_input(): Int{
    val index: String;
    index = readln();

    return index.toInt();
}


fun main()
{

    val choices = arrayOf("Addition", "Subtraction", "Division"," Multiplication", "Modulus")
    var input: Int
    var x: Int
    var y: Int
    var res: Int

    println("Kotlin Calculator")
    println("===============================\n\n")
    println("PLease select operation mode\n[1] Addition\n[2] Subtraction\n[3] Division\n[4] Multiplication\n[5] Modulus");
    
    input = ask_input()

    println("Selected operation -> ${choices[input - 1]}\n")
    println("Provide x: ")
    x = ask_input()

    println("Provide y: ")
    y = ask_input()

    val calc = Calculator(x, y, input)
    res = calc.engine()
    println("${choices[input - 1]} : ${x} and ${y} = ${res}")
    
    
    


}
