package com.lordSam.hackerRank
/*
John works at a clothing store.
He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

For example, there are n=7 socks with colors ar=[1,2,1,2,3,1]  .
There is one pair of color 1 and one of color 2.
There are three odd socks left, one of each color. The number of pairs is 2.
 */


fun main(){
    var pair = 0
    var ar: Array<Int> = arrayOf(1,2,1,2,1,3,4,3)
   // var setz = HashSet(listOf(*ar))
   // var setLength = setz.size

    var  arr = ar.distinct()

    for (i in 0 until arr.size){
        var count = 0
        for (j in 0 until ar.size){
            if (arr[i] == ar[j]){
                count++
            }
        }
        count /= 2
        pair += count
    }

    print(pair)
}