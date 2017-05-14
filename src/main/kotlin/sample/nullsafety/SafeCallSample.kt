package sample.nullsafety

/**
 * 安全呼び出しサンプル
 */
fun main(args: Array<String>) {
    val string: String? = null

    // メンバ関数の安全呼び出し
    // textがnull出ない場合のみlengthへの代入が行われる
    val length: Int? = string?.length
    println(length ?: "Null value") // lengthはnullのため"Null value"となる

    // NotNullを引数とする関数にNullableを渡す際の安全呼び出し
    // let関数を使用して行う
    val list: List<String>? = string?.let(::listOf) // text.let { listOf(text) } でもOK
    println(list ?: "Null list") // listはnullのため"Null list"となる
}