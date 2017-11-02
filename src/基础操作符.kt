fun main(args: Array<String>) {
    //一元操作符
    var a = 100
    val b = -a
    val c = +a
    println("${b},${c}")
    //二元操作符
    var d = a + b
    println("${d}")
    //赋值操作符
    var e = d
    println("${e}")
    //数学操作符
    println(3 + 4)
    println(3 - 4)
    println(3 * 4)
    println(12 / 4)
    println(13 % 4)
    //赋值与数学操作符的组合
    var gdp = 10_000.0
    var gdpGrowth = 6.7 / 100
    gdp += (gdp * gdpGrowth)
    println(gdp)
    //比较操作符
    println( 1 > 2)
    println( 1 >= 2)
    println( 1 < 2)
    println( 1 <= 2)
    //逻辑操作符
    var haveComputer = true
    var netAvailable = false
    var watchXioaboVideo = false
    if(haveComputer && netAvailable || watchXioaboVideo){
        println("学会kotlin不成问题")
    }else{
        println("学会kotlin成问题")
    }
    var tt = true
    var xx = !tt
    println(xx)
    //操作一个目标，是一元操作符
    var x = 3
    x = -112
    val y = -x
    println(y)
    //二元操作符操作2个目标，再2个目标之间，前后用空格分隔
    var z = x + y
    println(z)


}