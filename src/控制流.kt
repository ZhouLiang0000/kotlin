//用来检查和运算各种条件和逻辑的组合，控制APP的运行流向
//循环：for,while及循环控制
//if：二元判断
//when:细致化判断
fun main(args: Array<String>) {
    //for：1、依次操作一个序列，执行次数是可预测的
    val numbers = arrayOf(1,2,3,4)
    for (number in numbers) {
        println(number)
    }
    //     2、重复执行：
    for (a in 1..2) println("打印了语句")
    //while:循环执行一系列的操作，知道条件不成立，适合执行次数未知的场合
     var number = 1
     var times = 0
     var total = 0
    while (total < 5){
        total += number
        number += 1
        times += 1
        println("${total}执行了的次数${number}")
    }
    println(times)

    //循环中的控制：continue结束本次循环，break，结束整个循环
    for (number in numbers) {
        if (number == 2) continue
        if (number == 3) break
        println(number)
    }
    //if:条件判断语句，整个语句本身就是一个表达式(可用于简单的二元判断计算)
    val a = 3
    val b = 5
    val result = if (a > b) "大于" else 11
    println(result)
    //when: 可对某个变量的大小、范围、值表达式、类型等判断
    when (result) {
         in 0..10-> {
             println("0到10之间")
        }
//        (11) -> {
//            println("非0到10之间")
//        }
        is Int -> {
            println("int类型")
        }
        else -> {
            println("未知")
        }
    }
}