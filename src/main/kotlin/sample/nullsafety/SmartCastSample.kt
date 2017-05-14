package sample.nullsafety

/**
 * スマートキャストサンプル。
 */
fun main(args: Array<String>) {
    val string: String? = null

    // Nullチェックを行っていないため、以下はコンパイルエラー
    // println(string.length)

    // Nullチェックを行うことで、スマートキャストにより参照可能となる
    if (string != null) {
        println(string.length)
    }
}