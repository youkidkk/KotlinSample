package sample.basic

/**
 * 複数行文字列リテラルサンプル。
 */
fun main(args: Array<String>) {
    val texts = mutableListOf<String>()

    // 三連クォートで複数行の文字列リテラルとなる
    texts += """hoge
fuga
piyo"""

    // trimMargin を利用することで「|」までの先頭の空白を除去できる
    texts += """
        |hoge
        |fuga
        """.trimMargin()

    // trimMargin の引数を指定することで先頭の文字を変更できる
    texts += """
        >hoge
        """.trimMargin(">")

    for (text in texts) println(text)
}