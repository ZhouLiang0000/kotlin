fun main(args: Array<String>) {
    val diTieZhan = setOf("朱辛庄","生命科学园","西二旗","上地","知春路")
    val changPingXian = setOf("朱辛庄","生命科学园")
    val HaoXian = setOf("西二旗","上地","知春路")
    println(diTieZhan)
    println(changPingXian)
    println(HaoXian)
    println(diTieZhan.containsAll(changPingXian))
    println(diTieZhan.contains("上地"))

    println(diTieZhan.toTypedArray().size)
    //集合的交集
    var main = diTieZhan.intersect(changPingXian)
    println(main)
    //集合的差集
    println(diTieZhan.subtract(changPingXian))
    //集合的补集
    println(diTieZhan.union(HaoXian))
    println(diTieZhan.union(HaoXian).union(changPingXian))
    println(diTieZhan.toMutableSet())
    var newDiTieZhan = diTieZhan.union(changPingXian).union(HaoXian).toMutableSet()

    newDiTieZhan.add("五道口")
    for (s in newDiTieZhan) {
        println(s)
    }
    newDiTieZhan.remove("朱辛庄")
    for (s in newDiTieZhan) {
        println(s)

    }





}