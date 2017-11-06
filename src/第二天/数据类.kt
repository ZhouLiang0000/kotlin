package 第二天
//专用于只保存数据的类，比如用户自动登录的信息，聊天记录等
//这里的保存，并不是保存到磁盘，而是转成文本格式，便于保存
//kotlin数据类：data class 类名(属性列表)
data class Article2(var id:Int,var title:String)
fun main(args: Array<String>) {
    val article2 = Article2(1002,"学习")
    //数据类的序列化
    println(article2.toString())
    //复制 生成一个对象的克隆，并更改部分属性
    val article2NewTitle = article2.copy(title = "保存")
    println(article2NewTitle.toString())
    //数据类对象的解构
    val (id, title) = article2
    println("${id},${title}")
    //componentN列举属性
    println("${article2.component1()},${article2.component2()}")
}
