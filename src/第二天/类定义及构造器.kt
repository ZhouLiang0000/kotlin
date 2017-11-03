package 第二天
/**
 * 类定义及构造器
 */
//快捷定义：class 类名 constructor(属性列表){更多的属性和方法}
// 构造器：用来设置类的新实例的出厂配置
open class Chinese constructor(var sex:Boolean,var region:String){
    //普通属性，与变量定义类似
    open var skin = "yellow"
    //组合属性,有其他属性计算而来(get)
    val nianling : Double
        get() {
            when(this.region){
                "sh" -> {
                    return 83.3
                }
                "sx" -> {
                    return 78.5
                }else ->{
                    return 77.3
                }
            }
        }
    //组合属性反过来可以影响其他属性，set(可选),this代表实例
    var money : Int
        get() {
            when (this.region) {
                "sh" -> {
                    return 5000
                }
                "sx" -> {
                    return 3000
                }
                else -> {
                    return 2000
                }
            }
        }
        set(value) {
            when (value) {
                in 5000 ..Int.MAX_VALUE -> {
                    this.region = "sh"
                }
                in 3000 ..5000 -> {
                    this.region = "sx"
                }
                else -> {
                    this.region = "other"
                }
            }
        }
    //方法
    fun cook(){
        val menu = arrayOf("鸡蛋","土豆","茄子")
        val desc = menu.reduce { s1, s2 -> s1 + "," + s2}
        println("我会做${desc}")
    }
}

class shanxi(sex : Boolean,region: String = "sx") : Chinese(sex,region){
    var yuyan = "sxputonghua"
    override var skin = "sxyellow"
}
class shangxi(sex: Boolean,region: String) :Chinese(sex,region){
    var yuyan = "shangxiputonghua"
    override var skin = "shangxiyellow"
}

fun main(args: Array<String>) {
    val zhouliang = shanxi(true)
    zhouliang.money = 6000
    println(zhouliang.region)
    val guozi = shangxi(true,"shxi")
    println(guozi.region)
    val chinese = Chinese(true,"中国")
    println(chinese.cook())
}