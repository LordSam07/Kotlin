fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sum = 0
    var p = 0
    var s = 0

    for (i in arr.indices){
        for ( j in arr.indices){

            if ( i == j ){
                p+= arr[i][j]
            }

            if ( i+j == arr.size - 1){
                s+= arr[i][j]
            }

        }


    }
    sum = p - s

    if ( sum < 0)
        sum *= -1

    return sum

}

fun main(){
    val arr = Array<Array<Int>>(3) { Array<Int>(3) { 0 } }
    for (i in arr.indices){
        for ( j in arr.indices){
            arr[i][j] = readLine()!!.toInt()
        }
    }

    for (i in arr.indices){
        for ( j in arr.indices){
            print(" ${arr[i][j]} ")
        }
        println()
    }

    println(diagonalDifference(arr))


}