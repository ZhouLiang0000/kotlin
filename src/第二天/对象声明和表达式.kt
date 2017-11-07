package 第二天
//有时候只是要对某个类做轻微的改造，供临时使用，避免继承，对象声明和表达式就很有用
//对面向对象编程的优化，避免一些继承导致的代价过高，即内存使用过多，保持代码的简洁
//对中国人来说，这个类，可能各省人适合继承
open class Chineses(var name:String){
    open val skin = "yellow"

}



fun main(args: Array<String>) {
    //但如果是外部人入籍，就不适合继承
    //对象表达式： val 对象名 = object ：类，接口{//属性或方法的override定义}
    val baako = object : Chineses("Baako Zaid"){
        override val skin = "black"
    }
    println(baako.skin)
    //纯对象表达式：临时使用，无需继承任何类
    val tempParking = object{
        var x = 100
        var y = 200
    }
    println(tempParking.y)

    //相当于调用函数
    NetworkRequestManager.regjister()
    //伴生对象的方法与类的关联性强
    IDCard.create()
}
//对象声明，不能用在函数中，一般用于对其他类的一种使用上的包装
object NetworkRequestManager{
    fun regjister(){
        println("连接网络注册中....")
    }
}
//伴生对象：一般用于创建一个类的实例的“工厂”方法
//java中的静态成员
class IDCard{
    companion object {
        fun create() = IDCard()
    }
}