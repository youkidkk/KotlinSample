package sample.classes

/**
 * データクラスサンプル。
 * データだけを保持するためのクラスを定義する。
 */

/**
 * ・先頭に「data」を付与
 * ・プライマリコンストラクタに一つ以上の引数を持たせる
 */
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val taro = Person("Taro", 20)
    val taro2 = Person("Taro", 20)
    val hanako = Person("Hanako", 25)

    // toString()
    println(taro) // -> "Person(name=Taro, age=20)"

    // hashCode()
    println(taro.hashCode()) // -> "80578506"

    // componentN() : 宣言順で内容を取り出す
    println("${taro.component1()} : ${taro.component2()}") // -> "Taro : 20"

    // equals()
    println(taro == taro2) // -> true
    println(taro != hanako) // -> true

    // copy()
    val hanako2 = hanako.copy()
    println(hanako2) // -> "Person(name=Hanako, age=25)"
    val hanako3 = hanako.copy(age = 15)
    println(hanako3) // -> "Person(name=Hanako, age=15)"
}