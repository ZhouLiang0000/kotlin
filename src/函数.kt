fun main(args: Array<String>) {
    val b = add(2, 3)
    println(b)

    println(sum(1,2,3,4,4,5))
    val a = intArrayOf(1,2,3,4,5)
    println(sum(*a))
}

fun add(x: Int, y: Int): Int {
    return x + y
}
fun sum(vararg x: Int):Int{
    var total = 0
    for (i in x) {
        total += i
    }
    return total
}