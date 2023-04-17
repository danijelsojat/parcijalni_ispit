fun main(){

    var myArr: Array<Int> = arrayOf()
    for (i in 1..200){
        if (i % 2 == 0){
            myArr += i
        }
    }
    println("Zbroj svih elemenata polja: ${myArr.sum()}")
    println("Srednja vrijednost polja: ${myArr.average()}")
}