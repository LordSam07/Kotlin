package com.lordSam.basics

/* A naive recursive implementation that simply follows
the above optimal substructure property */
internal object MatrixChainMultiplication {
    // Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
    fun MatrixChainOrder(p: IntArray, i: Int, j: Int): Int {
        if (i == j)
            return 0

        var min = Integer.MAX_VALUE

        // place parenthesis at different places between first
        // and last matrix, recursively calculate count of
        // multiplications for each parenthesis placement and
        // return the minimum count
        for (k in i until j) {
            val count = MatrixChainOrder(p, i, k) +
                    MatrixChainOrder(p, k + 1, j) +
                    p[i - 1] * p[k] * p[j]

            if (count < min)
                min = count
        }

        // Return minimum count
        return min
    }

    // Driver program to test above function
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 3)
        val n = arr.size

        println("Minimum number of multiplications is " + MatrixChainOrder(arr, 1, n - 1))

    }
}

