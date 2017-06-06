package sample.function

/**
 * デフォルト引数サンプル。
 */
fun defaultArgSample(number: Int = 123,  // 引数の宣言の後にデフォルト値を指定する
                     text: String = "hoge"
) = println("Number : $number, Text : $text")

fun main(args: Array<String>) {
    // 通常の呼び出し方法
    defaultArgSample(234, "fuga")
    // 先頭の引数のみ指定し、他はデフォルト値を使用する方法
    defaultArgSample(345)
    // 引数名を指定した呼び出し方法
    defaultArgSample(text = "piyo")
}