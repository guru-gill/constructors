
class Con(var a:Int,var b:Int ) {
    var c=0
    init {
        this.c=a+b
        println(c)
    }
    init {
        println(a+b)
    }

}

infix fun Int.add1(a:Int):Int
{
    println(a)
return a
}
fun main(){
    Con(2,8)
    var a:Int = 1
    a.add1(4)

}


