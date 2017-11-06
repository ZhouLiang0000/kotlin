package 第二天
//类中嵌套其他类

//新闻类
class News {
    private var lang = "cn"

    class Category{
        var list = arrayOf("推荐","头条","体育","NBA","科技","美女")
        val listDesc = list.joinToString()
    }
    //内部类，新闻语种，直接为主类服务
    inner class Lang{
        fun changRegion(newRegion:String){
            //内部类可以访问主类的属性
            lang = newRegion
            println("现在可以查看${lang}地区的新闻")
        }
    }
}

fun main(args: Array<String>) {
    //显示中国地区的新闻列表
    println(News.Category().listDesc)
    News().Lang().changRegion("usa")
}