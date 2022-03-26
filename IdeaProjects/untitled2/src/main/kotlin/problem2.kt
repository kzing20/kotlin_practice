fun Func(num: Int){
    var n: Int = num
    while(n < 100){
        n+=1
        println("$n")
    }
    return
}
fun main(){
    Func(10)
}