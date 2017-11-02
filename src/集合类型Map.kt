fun main(args: Array<String>) {
    //定义
    //mapOf<Key,Value>(Pair(Key,Value),...)
    val address = mapOf<String, String>(Pair("山西","太原"),Pair("山东","济南"),Pair("陕西","西安"))
    println(address.size)
    println(address.isEmpty())
    println(address.get("陕西"))
    println(address.getOrDefault("北京","中国"))
    println(address.keys)
    println(address.values)

    val addressType = address.toMutableMap()
    //添加和更新：下标方法 map变量名[key] = value
    addressType["山西"] = "长治"
    addressType["我的家乡"] = "南和村"
    for (mutableEntry in addressType) {
        println(mutableEntry.value)
        println("${mutableEntry.key}------${mutableEntry.value}")
    }
    addressType.remove("我的家乡")
    println(addressType.values)


}