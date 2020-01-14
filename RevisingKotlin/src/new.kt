import java.lang.Integer.parseInt

fun main(){

    //val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    //fruits  .filter { it.startsWith("a") }  .sortedBy { it }  .map { it.toUpperCase() }  .forEach { println(it) }




}

fun String.spaceToCamelCase() {
    "Convert this to camelcase".spaceToCamelCase()
}

fun sum(a: Int, b: Int) = a + b //function as expression

fun maxOf(a: Int, b: Int) = if (a > b) a else b//condition as expression

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
     //Using `x * y` yields error because they may hold nulls.
     if (x != null && y != null) {
    // x and y are automatically cast to non-nullable after null check
     println(x * y)
     }    else {
     println("'$arg1' or '$arg2' is not a number")
     }

//or
//    if (x == null) {
//        println("Wrong number format in arg1: '$arg1'")
//        return
//    }
//    if (y == null) {
//        println("Wrong number format in arg2: '$arg2'")
//        return }
//        // x and y are automatically cast to non-nullable after null check
//        println(x * y)
     }


