package sample.function

/**
 * 高階関数サンプル。
 */

// 引数に関数オブジェクトをとる関数 -> 高階関数
fun func(s: String, funcArg: (String) -> Int) : String {
    return "arg : $s, func result : ${funcArg(s)}"
}

fun main(args: Array<String>) {
    // 引数の変数名を指定する記法
    println(func("hoge",{ s -> s.length }))
    // 引数が一つの場合に、変数名を省略して「it」で引数を指定する記法
    println(func("hogehoge", { it.length }))
    // 引数の最後がラムダ式の場合に、そのラムダ式を引数リストの外に置く記法
    println(func("hogehogehoge") { it.length })
    // メソッド参照
    println(func("fuga", ::argFunc))
}

fun argFunc(s: String) : Int {
    return s.length
}