package com.lordSam.hackerRank

fun main(){
    var s = "UUDDDUDU"
    val n = s.length
    var end = 0
    val min: Int = 2
    val max: Int = 1000000;
    var isInValley: Boolean = false;
    var valleys: Int = 0;
    //var sr = s.split("").toTypedArray()
    var arr:Array<Int> = Array(n){0}
    var path = 0


    if ( n in min..max)
         {
             for ( i in 0 until n){
                 if (s[i] == 'U')
                 {
                     arr[i] = 1
                 }else{
                     arr[i] = -1
                 }
             }
        }

}