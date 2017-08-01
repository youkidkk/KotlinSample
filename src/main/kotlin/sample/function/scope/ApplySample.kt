package sample.function.scope

/**
 * apply関数サンプル。
 * インスタンスに対する複数の操作を完結に記述できる。
 */
fun main(args: Array<String>) {
    val sample = ApplySample()
    sample.apply {
        arg1 = "val 1"
        arg2 = "val 2"
    }
    println(sample)
}

private class ApplySample() {
    var arg1: String = ""
    var arg2: String = ""

    override fun toString(): String {
        return "$arg1 : $arg2"
    }
}