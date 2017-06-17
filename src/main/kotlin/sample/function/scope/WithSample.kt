package sample.function.scope

/**
 * with関数サンプル。
 * インスタンスに対する複数の操作を完結に記述できる。
 */
fun main(args: Array<String>) {
    val sample = with(Sample()) {
        arg1 = "val 1"
        arg2 = "val 2"
        this
    }
    println(sample)
}

class Sample() {
    var arg1: String = ""
    var arg2: String = ""

    override fun toString(): String {
        return "$arg1 : $arg2"
    }
}