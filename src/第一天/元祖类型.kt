package 第一天

fun main(args: Array<String>) {
    val (day ,method ,course) = Triple(3,"学会","kotlin")
    val (desc,toll) = Pair("学费",0)
    print("${day}天${method}${course},${desc}只需要${toll}")
}