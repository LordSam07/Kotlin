import com.lordSam.algos.SearchAlgos
import com.lordSam.algos.SortingAlgos

fun main(){

    val obj = SortingAlgos()
    var arr= arrayOf(0,1,9,6,2,3,4,5)

    obj.mergeSort(arr,0,arr.size-1)
    obj.printArray(arr)
}



