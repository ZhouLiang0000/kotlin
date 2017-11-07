package 第一天

//高阶函数：参数或返回值的类型是函数型
// 函数型：(参数) -> 返回值
//lambda：一种无名函数的简写  { (参数) -> 函数的执行语句 }
//其他语言称闭包，既有能力访问其自身范围外的变量
fun main(args: Array<String>) {
    //高阶函数：描述任务的结果，而不是使用循环详细推算
    //map : 常用语对集合类型的元素类型整体转变
    val a = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val b = a.map { "第${it}" }
    for (s in b) {
        println(s)

    }
    //其lambda中参数的约定名称为it
    //filter：对集合类型进行筛选
    var sum = 0
    val c = a.filter { it % 2 == 0 }
    for (i in c) {
        println(i)

    }
    a.filter { it % 2 == 0 }.forEach{
        sum += it
        println(sum)
    }
}