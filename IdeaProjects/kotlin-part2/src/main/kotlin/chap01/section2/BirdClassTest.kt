package chap01.section2

class Bird{
    //프로퍼티
    var name: String
    val wing: Int
    var beak: String

    constructor(_name: String, _wing: Int, _beak: String){//부 생성자
        name= _name
        wing = _wing
        beak = _beak
    }

    constructor(_name: String, _beak: String){//부 생성자
        name= _name
        wing = 2
        beak = _beak
    }
    /*init{
        println("--------init start--------")
        name = name.capitalize()
        println("name: $name, wing: $wing, beak: $beak")
        println("--------init end----------")
    }*/
    //메서드
    fun fly(){
        println("Fly")
    }
}

fun main(){
    val coco = Bird("coco",2,"long")
    val coco2 = Bird("coco", "long")
    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)

    println("coco2: name: ${coco2.name}, wing: ${coco2.wing}, beak: ${coco2.beak}")
}