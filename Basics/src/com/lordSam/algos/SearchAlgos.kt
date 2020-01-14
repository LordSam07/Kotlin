package com.lordSam.algos

import kotlin.math.floor
import kotlin.math.sqrt

class SearchAlgos {

    //Linear Search Algorithm
    fun linearSearch(arr: Array<Int>, victim: Int) {

        var found: Int? = null

        for (i in arr) {
            if (arr[i] == victim)
                found = i
            break
        }
        if (found != null)
            println("Element found at $found index.")
        else
            println("Element not found")
    }

    //Binary Search Algorithm
  tailrec fun binarySearch(arr: Array<Int>, lower: Int, upper: Int, victim: Int){

        arr.sort()

        if ( upper == lower){
            if (arr[lower] == victim)
                println("Element found at $lower index")
            else
                println("Element not found.")
        }
        else{
            var mid: Int = (upper + lower) / 2

            if (arr[mid] == victim)
                println("Element found at $mid index")
            else {
                if (arr[mid] < victim)
                    binarySearch(arr, mid + 1, upper, victim)
                else
                    binarySearch(arr, lower, mid, victim)
            }
        }
    }


    //Jump Searching Algorithm
    fun jumpSearch(arr: Array<Int>, x: Int): Int {
        val n = arr.size
        arr.sort()

        var step = floor(sqrt(n.toDouble())).toInt()

        var prev = 0
        while (arr[step.coerceAtMost(n) - 1] < x) {
            prev = step
                        step += step
            if (prev >= n)
                return -1
        }

        while (arr[prev] < x) {
            prev++

            if (prev == step.coerceAtMost(n))
                return -1
        }

        return if (arr[prev] == x) prev else -1

    }
}