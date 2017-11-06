package 第二天
//有限个类型的列举
//其中的每一个称之为枚举常量(可带初始值)，每一个以逗号分隔
//扑克牌花色
enum class PokerCard{
    红心,方块,梅花,黑桃
}
//带构造器的枚举类
enum class Size(val height:Int){
    s(150),m(160),L(170)
}

fun main(args: Array<String>) {
    //列举枚举类的常量
    println(PokerCard.values().joinToString())
    //枚举类的属性
    println(Size.valueOf("s").name)
    println(Size.valueOf("s").ordinal)

    println(Size.values().joinToString{it.name + "-" +it.height})
}

