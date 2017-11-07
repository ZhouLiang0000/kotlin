package 第一天

fun main(args: Array<String>) {
    var adds : String = "我的家在东北"
    var sex : Boolean ?
    sex = false
    if (adds != ""){
        print("${adds}")
    }
    if (sex == false) {
        print("地址：${adds}，性别：${sex}")
    }

}