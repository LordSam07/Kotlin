fun main(){

    val a = arrayOf(1,2,3)
    val b = arrayOf(3,2,1)
    var c= compareTriplets(a,b)
    for (i in c.indices){
        print("${c[i]} ")
    }

}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var c :Array<Int> = Array<Int>(2){0}
    for (i in a.indices) {
        if (a[i] in 1..100 || b[i] in 1..100) {
            if (a[i] > b[i]) {
                c[0] += 1
            } else if (a[i] < b[i]) {
                c[1] += 1
            }
        }
    }
    return c
}