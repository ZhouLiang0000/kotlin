package 第二天
//对可能发生执行异常的代码的一种保护措施，默认异常类：Exception
fun main(args: Array<String>) {
    //直接展示错误
    try {
        "333ggg".toInt()
    }catch (e : Exception){
        println(e)
    }
    //忽略错误
    val a :Int ? = try {
        "333ggg".toInt()
    }catch (e : Exception){
        null
    }
    println(a)
}

