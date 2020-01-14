class Pattern {

    fun makePattern(type :Int, height :Int){

        when(type){
            1 -> { for (i in 0..height) {
                for (j in 0 until i) {
                    print("* ")
                }
                println()
            }}

            2 -> { for (i in 0..height) {
                for (j in 0 until i) {
                    print("Payal ")
                }
                println()
            }}

            3 -> { for (i in 0..height) {
                for (j in 0 until i) {
                    print("Sam ")
                }
                println()
            }}

            4 -> { for (i in 0..height) {
                for (j in 0 until i) {
                    print("* ")
                }
                println()
            }}

        }
    }

    fun makePattern(type :Char){

        var e = arrayOf(6, 6, 2, 2, 5 ,5 ,2 ,2 ,6 ,6)
        var f = arrayOf(6, 6, 2, 2, 5, 5, 2, 2, 2)

        when(type){
            'F' -> { for (i in f) {
                for (j in 0 until i) {
                    print("F ")
                }
                println()
            }}

            'E' -> { for (i in e) {
                for (j in 0 until i) {
                    print("E ")
                }
                println()
            }}
//
//            3 -> { for (i in 0..height) {
//                for (j in 0 until i) {
//                    print("Sam ")
//                }
//                println()
//            }}
//
//            4 -> { for (i in 0..height) {
//                for (j in 0 until i) {
//                    print("* ")
//                }
//                println()
//            }}

        }

    }
}