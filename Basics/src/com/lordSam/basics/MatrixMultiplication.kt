package com.lordSam.basics

fun main(){

    println("Enter the value of m: ")
    val m: Int = readLine()!!.toInt()

    println("Enter the value of n: ")
    val n: Int = readLine()!!.toInt()

    var obj = Matrix()

    val arr1: Array<IntArray> = obj.insertMatrix(m, n)

    val arr2: Array<IntArray> = obj.insertMatrix(m, n)

    val arr3: Array<IntArray> = obj.matrixMultiplication(arr1, arr2, m, n)

    obj.printArray(arr3, m , n)
}

class Matrix {

    fun matrixMultiplication(arr1: Array<IntArray>, arr2: Array<IntArray>, m: Int, n: Int): Array<IntArray> {

        var temp2 = Array(m) { IntArray(n) }

        for (i in 0 until m) {
            for (j in 0 until n) {
                for (k in 0 until n) {
                    temp2[i][j] += arr1[i][k] * arr2[k][j]
                }
            }
        }
        return temp2
    }

    fun insertMatrix(m: Int, n: Int): Array<IntArray> {

        println("Enter the matrix elements: ")

        var temp = Array(m) { IntArray(n) }

        for (i in 0 until m) {
            for (j in 0 until n) {
                temp[i][j] = readLine()!!.toInt()
            }
        }
        return temp;
    }

    fun printArray(arr: Array<IntArray>, m: Int, n: Int) {

        for (i in 0 until m) {
            for (j in 0 until n) {
                print(arr[i][j])
            }
            println()
        }
    }
}