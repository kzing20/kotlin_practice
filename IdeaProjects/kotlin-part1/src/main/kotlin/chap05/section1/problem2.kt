package chap05.section1

fun MyFunc(num: Int){
    var n: Int = num
    while(n < 100){
        n+=1
        println("$n")
        if (n==100)
            break
    }

}
fun main(){
    MyFunc(10)
}