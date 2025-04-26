package calculator_operations

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
