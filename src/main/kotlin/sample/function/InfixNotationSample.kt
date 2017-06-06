package sample.function

/**
 * 中置記法サンプル。
 * ・メンバ関数または拡張関数である
 * ・infix修飾子を指定する
 * ・引数を一つのみとする
 */
infix fun String.join(text: String): String = this + text

fun main(args: Array<String>) {
    // 中置記法を用いた呼び出し
    println("hoge" join "fuga")
    // 上記は以下と同義
    println("hoge".join("fuga"))
}