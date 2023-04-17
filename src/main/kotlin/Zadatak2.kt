fun main(){
    printNumbers(9, 19)
}
fun printNumbers(num1: Int, num2: Int){
    if (num1 < num2){
        for (i in num1..num2){
            println(i)
        }
    } else if (num2 < num1){
        for (i in num2..num1){
            println(i)
        }
    } else {
        println("Numbers are equal")
    }
}