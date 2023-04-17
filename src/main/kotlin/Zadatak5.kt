fun main(){

    val myArr = Array<Int>(100){(it + 1) * 2}
    println("Zbroj svih elemenata polja: ${myArr.sum()}")
    println("Srednja vrijednost polja: ${myArr.average()}")
}