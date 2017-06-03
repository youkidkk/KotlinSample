package sample.basic

/**
 * Stringテンプレートサンプル。
 */
fun main(args: Array<String>) {
    val text = "hoge fuga"
    // $<変数名>で文字列中に変数の値が埋め込まれる
    println("Text : $text") // -> hoge fuga

    val number1 = 100
    val number2 = 200
    // {}で囲むと中の式の結果の値が埋め込まれる
    println("Sum of numbers : ${number1 + number2}") // -> 300

    // 関数の結果でも可
    println("${function(100)}") // -> 200

    // 「\」でエスケープ
    println("\$text \${function(100)} \\")
}

fun function(i: Int) : Int {
    return i * 2
}