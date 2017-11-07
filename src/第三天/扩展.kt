package 第三天
//扩展：对既有的类增加新功能而无需继承该类，及时无法获取其源代码。
//主要作用是立即为相关类整体上添加“工具类(Utils)”方法或属性
//kotlin支持：扩展函数、属性
//与接受者中的参数、名称都一样的扩展是无效的
//尽量避免与已有的名字重名，如果一定要重名，参数名和类型也要不一样
//扩展函数：fun 接受者类型.新扩展函数名(参数类别){//函数实现}
//1、普通函数的扩展：整数的平方
fun Int.square(): Int {
    return this * this
}

//泛型属性的扩展
//1、普通属性扩展。例子：整数的下一个数字
val Int.next:Int
    get() = this + 1
//2、泛型属性扩展：数字类型的半径对应的面积：3.area 面积πr²
val <T:Number> T.area:Double
    get() = 3.1415926 * this.toDouble() * this.toDouble()

fun main(args: Array<String>) {
    println(3.square())
    val a = arrayOf(1,2,3,4,5,6,7,8)
    println(a.max())//集合自带的方法
    println(a.biggest())
    println(a.smallest())
    println(3.next)
    println(2.2.area)
}
//2、泛型函数的扩展：取数字型数组中最大和最小的元素
fun <T> Array<T>.biggest(): T
    where T:Number,
          T:Comparable<T>
{
    var biggest = this[0]
    for (i in 1..lastIndex){
        val element = this[i]
        if ( element > biggest){
            biggest = element
        }
    }
    return biggest
}
fun <T> Array<T>.smallest(): T
        where T:Number,
              T:Comparable<T>
{
    var smallest = this[0]
    for (i in 1..lastIndex){
        val element = this[i]
        if ( element < smallest){
            smallest = element
        }
    }
    return smallest
}