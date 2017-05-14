package sample.classes

/**
 * クラスの継承サンプル。
 */

/**
 * スーパークラス。
 * 継承を可能とする場合は「open」を付与する。
 */
open class SuperClass(val name: String) {
    /** オーバーライドを可能とする場合は「open」を付与する。 */
    open fun print() = println("Name is $name.")
}

class SubClass(name: String, val value: String) : SuperClass(name) {
    /** オーバーライドをする場合は「override」を付与する。 */
    override fun print() = println("Name is $name. Value is $value.")
}

fun main(args: Array<String>) {
    SuperClass("Hoge").print() // -> Name is Hoge.
    SubClass("Fuga", "Piyo").print() // -> Name is Fuga. Value is Piyo.
}