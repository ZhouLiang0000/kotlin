package 第三天
//让一个类型能被“广泛”使用，机通用化，称之为“泛型”
//一般用于函数的参数类型定义，让函数更通用

fun main(args: Array<String>) {
    //最常用的例子： print()和println()函数，几乎可以让任何类型的参数
    println(3)
    println("泛型")
    println(arrayOf("Swift","Kotlin","Android","IOS"))
    //Array,参数也可以是任意类型
    val a = arrayOf(1,2,3)
    //自定义一个泛型函数: <T>,T代表一个占位符，用尖括号包含
    fun <T> showText(para:T){
        println(para)
    }
    showText(3)
    showText("我也是泛型函数")

    //泛型约束：<泛型占位符：类型>
    fun <T:Number> sum(vararg numbers:T):Double{
        return numbers.sumByDouble { it.toDouble() }
    }
    println(sum(2,45,5,6,34.45,44))

    //多重约束：where，各个约束用逗号分隔，写在函数体之前
    //例子：把数组中大于某个元素的部分取出来并且升序排列
    fun <T> biggerPart(list: Array<T>, threhold: T): List<T>
        where T : Number,T : Comparable<T>
    {
        return list.filter { it >= threhold }.sorted()
    }
    val b = arrayOf(0,1,2,3,4,5,6)
    println(biggerPart(b,3))
}