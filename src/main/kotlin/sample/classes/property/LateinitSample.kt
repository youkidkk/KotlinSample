package sample.classes.property

/**
 * lateinitサンプル。
 * NotNullなプロパティの値設定を宣言時に行わなくて良くなる。
 */
class LateinitSample {
    // 宣言時はnull
    lateinit var string: String

    constructor() {
        // 初期化時に値設定
        string = "Hoge Hoge Hoge!!!"
    }
}

fun main(args: Array<String>) {
    val sample = LateinitSample()

    println(sample.string)
}