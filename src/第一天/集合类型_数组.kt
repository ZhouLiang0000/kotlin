package 第一天

//有序可重复-Array,索引从0开始
//有序不重复-set
//无序可重复-map，但值有唯一的键(key)
fun main(args: Array<String>) {
    var nollstations = arrayOf("朱辛庄","生命科学园","西二旗","朱辛庄")
    for (nollstation in nollstations) {
//        println(nollstation)
    }


    var nollstationNamePlaceholder = Array(20,{"30号线站名占位"})
    for (s in nollstationNamePlaceholder) {
//        println(s)
    }


    var onToHundred = Array(100,{i -> i + 1})
    for (unit in onToHundred) {
//        println(unit)
//        println(onToHundred.count())
//        println(onToHundred.isEmpty())
    }
//    println(onToHundred.first())
//    println(onToHundred[8])


    val nollstation = nollstations.toSet()
    for (s in nollstation) {
//        println(s)
    }

    val noll = nollstations.sliceArray(2..2)
    for (s in noll) {
//        println(s)

    }
    var mutable = mutableListOf("朱辛庄","生命科学园","西二旗","朱辛庄")
    mutable.add("上地")
    mutable.removeAt(1)
    for (s in mutable.distinct()) {
        println(s)

    }


}