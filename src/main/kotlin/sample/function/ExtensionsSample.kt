package sample.function

/**
 * 拡張関数のサンプル。
 * 既存の型にメソッドを追加することができる。
 */

/** 【型名】.【関数名】で宣言する。 */
fun String.println() {
    println(this + "!!!")
}

fun main(args: Array<String>) {
    val string = "hoge hoge piyo piyo"

    /** String型にprintlnが追加されている */
    string.println()
}