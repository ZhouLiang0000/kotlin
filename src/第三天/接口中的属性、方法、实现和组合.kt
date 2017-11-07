package 第三天
//接口定义 ： interfaca 接口名 {// 接口体(各种属性和方法定义)}
//很多外国人入籍
interface Livable {
    val hasSkill: Boolean
}
interface ChinaLivable{
    //接口中的属性只有类型定义，不可初始化
    val hasJobOffer : Boolean
    //接口中的属性可以有get，通常用于单纯增加一个常量属性
    val visaCategory: String
        get() = "工作签证"
    //接口中的变量属性
    var city : String
    //接口中的方法
    fun speakChinese()
    //接口中的方法可以有默认实现，通常指该方法是固定不变的
    fun handleGuanxi(){
        println("我知道在中国要非常注重处理人际关系。")
    }
    var bankDeposite : Int
}
open class Person{
    var name = ""
}
//继承父类，并实现多个接口
class ForigenChinese : Person(), Livable,ChinaLivable{
    override val hasSkill: Boolean = true
    override val hasJobOffer: Boolean = true
    override var city: String = ""
    override fun speakChinese() {
        println("我叫${this.name},我汉语相当棒的")
    }
    override var bankDeposite = 100000
}

fun main(args: Array<String>) {
    val tom = ForigenChinese()
    tom.name = "汤格林"
    tom.city = "上海"
    tom.speakChinese()
    tom.handleGuanxi()
    println(tom.visaCategory)
    println(tom.hasSkill)
}
