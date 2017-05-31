package sample.classes.constructor

/**
 * セカンダリーコンストラクタサンプル。
 */
class SecondaryConstructorSample(val prop1: String, val prop2: String) {
    // セカンダリーコンストラクタ
    // 「:」の後でプライマリーコンストラクタを呼び出す必要がある
    constructor(prop1: String) : this(prop1, "123")

    // セカンダリーコンストラクタは複数定義できる
    constructor() : this("abc", "123")

    override fun toString(): String {
        return "$prop1 : $prop2"
    }
}

fun main(args: Array<String>) {
    val sample1 = SecondaryConstructorSample("aaa")
    println(sample1)

    val sample2 = SecondaryConstructorSample()
    println(sample2)
}