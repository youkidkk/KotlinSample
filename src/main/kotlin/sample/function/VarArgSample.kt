package sample.function

/**
 * 可変長引数サンプル。
 */

/** 引数を「vararg」で指定する */
fun varArgFunc(vararg strings: String) : String {
    // Javaと同様に配列として扱われる
    if (strings.isNotEmpty()) println("First : ${strings[0]}")
    return strings.joinToString(separator = ", ")
}

fun main(args: Array<String>) {
    println(varArgFunc("hoge", "fuga", "piyo"))
    println(varArgFunc())
}