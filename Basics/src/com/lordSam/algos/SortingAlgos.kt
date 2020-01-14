package com.lordSam.algos

import java.util.Arrays



class SortingAlgos {


    //Selection Sorting Algorithm
    fun selectionSort(arr: Array<Int>) {
        val n = arr.size

        for (i in 0 until n - 1) {
            var min = i
            for (j in i + 1 until n)
                if (arr[j] < arr[min])
                    min = j

            val temp = arr[min]
            arr[min] = arr[i]
            arr[i] = temp
        }
    }


    //Bubble Sorting Algorithm
    fun bubbleSort(arr: Array<Int>) {
        val n = arr.size
        for (i in 0 until n - 1)
            for (j in 0 until n - i - 1)
                if (arr[j] > arr[j + 1]) {

                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
    }


    //Insertion Sorting Algorithm
    fun insertionSort(arr: Array<Int>) {
        val n = arr.size
        for (i in 1 until n) {
            val key = arr[i]
            var j = i - 1

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j -= 1
            }
            arr[j + 1] = key
        }
    }


    //Merge Sorting Algorithm
    private fun merge(arr: Array<Int>, l: Int, m: Int, r: Int) {

        val n1 = m - l + 1
        val n2 = r - m

        val L = IntArray(n1)
        val R = IntArray(n2)

        for (i in 0 until n1)
            L[i] = arr[l + i]
        for (j in 0 until n2)
            R[j] = arr[m + 1 + j]

        var i = 0
        var j = 0
        var k = l

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]
                i++
            } else {
                arr[k] = R[j]
                j++
            }
            k++
        }

        while (i < n1) {
            arr[k] = L[i]
            i++
            k++
        }

        while (j < n2) {
            arr[k] = R[j]
            j++
            k++
        }
    }
    fun mergeSort(arr: Array<Int>, l: Int, r: Int) {
        if (l < r) {
            // Find the middle point
            val m = (l + r) / 2

            // Sort first and second halves
            mergeSort(arr, l, m)
            mergeSort(arr, m + 1, r)

            // Merge the sorted halves
            merge(arr, l, m, r)
        }
    }


    //Heap Sorting Algorithm
    fun heapSort(arr: Array<Int>) {
        val n = arr.size

        for (i in n / 2 - 1 downTo 0)
            heapify(arr, n, i)

        for (i in n - 1 downTo 0) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp

            heapify(arr, i, 0)
        }
    }
    private fun heapify(arr: Array<Int>, n: Int, i: Int) {
        var largest = i
        val l = 2 * i + 1
        val r = 2 * i + 2

        if (l < n && arr[l] > arr[largest])
            largest = l

        if (r < n && arr[r] > arr[largest])
            largest = r

        if (largest != i) {
            val swap = arr[i]
            arr[i] = arr[largest]
            arr[largest] = swap

            heapify(arr, n, largest)
        }
    }


    //Quick Sorting Algorithm
    private fun partition(arr: Array<Int>, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] < pivot) {
                i++

                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp

        return i + 1
    }
    fun quickSort(arr: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val pi = partition(arr, low, high)
            quickSort(arr, low, pi - 1)
            quickSort(arr, pi + 1, high)
        }
    }


    //Shell Sorting Algorithm
    fun shellSort(arr: Array<Int>): Int {
        val n = arr.size

        var gap = n / 2
        while (gap > 0) {
            var i = gap
            while (i < n) {
                val temp = arr[i]
                var j: Int = i

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap]
                    j -= gap
                }
                arr[j] = temp
                i += 1
            }
            gap /= 2
        }
        return 0
    }


    //Print Array
    fun printArray(arr: Array<Int>) {
        val n = arr.size
        for (i in 0 until n)
            print(arr[i].toString() + " ")
        println()
    }


}