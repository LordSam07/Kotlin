class TicTacToe {

    private var count :Int = 0
    private var clock :Int = 0

    fun createMatrix() {

        val array: Array<CharArray> = Array(3) { CharArray(3) }

        for (i in array.indices)
            for (j in array.indices)
                array[i][j] = '_'

                printMatrix(array)

        do {
            matrixFiller(array)
            printMatrix(array)
            winner(array)
            ++clock
        }while (clock <= 9)
    }

    private fun printMatrix(arr: Array<CharArray>) {
        for (i in arr.indices) {
            for (j in arr.indices) {
                print("${arr[i][j]}  ")
            }
            println()
        }
    }


    private fun matrixFiller(arr: Array<CharArray>) {

        var i  = 0
        var j  = 0

        println("Enter Cell Number-")

        when (readLine()!!.toInt()){
            1 -> {i = 0 ; j = 0}
            2 -> {i = 0 ; j = 1}
            3 -> {i = 0 ; j = 2}
            4 -> {i = 1 ; j = 0}
            5 -> {i = 1 ; j = 1}
            6 -> {i = 1 ; j = 2}
            7 -> {i = 2 ; j = 0}
            8 -> {i = 2 ; j = 1}
            9 -> {i = 2 ; j = 2}
            else -> {
                println("Enter valid value")
                matrixFiller(arr)
            }
        }

       if (++count % 2 == 0)
       {
           if (arr[i][j] == '_'){
               arr[i][j] = 'X'
           }
           else{
               println("Invalid Try!")
               printMatrix(arr)
               count--
               matrixFiller(arr)
           }
       } else{
           if (arr[i][j] == '_'){
               arr[i][j] = 'O'
           }
           else{
               println("Invalid Try!")
               printMatrix(arr)
               count--
               matrixFiller(arr)
           }
       }
    }

    private fun winner(arr :Array<CharArray>) {

            if (count < 9) {

                //Row 1
                if (arr[0][0] != '_' && arr[0][1] != '_' && arr[0][2] != '_' && arr[0][0] == arr[0][1]  && arr[0][1] == arr[0][2]){
                    if ( arr[0][0] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Row 2
                if (arr[1][0] != '_' && arr[1][1] != '_' && arr[1][2] != '_' && arr[1][0] == arr[1][1]  && arr[1][1] == arr[1][2]){
                    if ( arr[1][0] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Row 3
                if (arr[2][0] != '_' && arr[2][1] != '_' && arr[2][2] != '_' && arr[2][0] == arr[2][1]  && arr[2][1] == arr[2][2]){
                    if ( arr[2][0] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Column 1
                if (arr[0][0] != '_' && arr[1][0] != '_' && arr[2][0] != '_' && arr[0][0] == arr[1][0]  && arr[1][0] == arr[2][0]){
                    if ( arr[0][0] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Column 2
                if (arr[0][1] != '_' && arr[1][1] != '_' && arr[2][1] != '_' && arr[0][1] == arr[1][1]  && arr[1][1] == arr[2][1]){
                    if ( arr[0][1] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Column 3
                if (arr[0][2] != '_' && arr[1][2] != '_' && arr[2][2] != '_' && arr[0][2] == arr[1][2]  && arr[1][2] == arr[2][2]){
                    if ( arr[0][2] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Primary Diagonal
                if (arr[0][0] != '_' && arr[1][1] != '_' && arr[2][2] != '_' && arr[0][0] == arr[1][1]  && arr[1][1] == arr[2][2]){
                    if ( arr[0][0] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                //Secondary Diagonal
                if (arr[0][2] != '_' && arr[1][1] != '_' && arr[2][0] != '_' && arr[0][2] == arr[1][1]  && arr[1][1] == arr[2][0]){
                    if ( arr[0][2] == 'X'){
                        println("Player X won!")
                    }
                    else{
                        println("Player O Won!")
                    }
                    count = 0
                    clock = 0
                    createMatrix()
                }

                } else {
                    println("Match Draw!")

                count = 0
                clock = 0
                createMatrix()
                }
        }
}