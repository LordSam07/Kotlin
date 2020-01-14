import kotlin.random.Random

class CatchMe {

    private var end = 0

    fun createMatrix(){

        val array: Array<CharArray> = Array(3) { CharArray(3) }

        for (i in array.indices){
            for (j in array.indices){
                array[i][j] = 'O'
            }
        }
        while (end < 10) {
            end++
            createMole(array)
            printMatrix(array)
            catchMole(array)
            println()
            createMatrix()
        }
    }


    private fun printMatrix(array: Array<CharArray>){

        for (i in array.indices){
            for (j in array.indices){
                print("${array[i][j]}  ")
            }
            println()
        }
    }


    private fun createMole(array: Array<CharArray>){

        val i :Int = Random.nextInt(0,3)
        val j :Int = Random.nextInt(0,3)

        array[i][j] = '@'

    }


    private fun catchMole(array: Array<CharArray>){
        var i = 0
        var j = 0

        println("Enter the index!  ")
        when(readLine()!!.toInt()){

            1 -> {i = 0; j = 0}
            2 -> {i = 0; j = 1}
            3 -> {i = 0; j = 2}
            4 -> {i = 1; j = 0}
            5 -> {i = 1; j = 1}
            6 -> {i = 1; j = 2}
            7 -> {i = 2; j = 0}
            8 -> {i = 2; j = 1}
            9 -> {i = 2; j = 2}
            else -> {
                println("Please behave yourself!")}

        }

        if ( array[i][j] == '@'){
            array[i][j] = 'X'
            printMatrix(array)
            println("A hit!")
        }

    }









}