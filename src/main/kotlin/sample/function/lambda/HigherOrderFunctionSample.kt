package sample.function.lambda

/**
 * 高階関数サンプル。
 */

// 高階関数 : 引数に関数オブジェクトをとる関数
fun func(s: String, funcArg: (String) -> Int) : String {
    return "arg : $s, func result : ${funcArg(s)}"
}

fun main(args: Array<String>) {
    // 引数の変数名、型を指定する記法
    println(func("hoge", { s: String -> s.length }))
    // 引数の変数名のみ指定し、型推論により型を省略した記法
    println(func("hogehoge", { s -> s.length }))
    // 引数が一つの場合に、変数名を省略して「it」で引数を指定する記法
    println(func("hogehogehoge", { it.length }))
    // 引数の最後がラムダ式の場合に、そのラムダ式を引数リストの外に置く記法
    println(func("hogehogehogehoge") { it.length })
    // メソッド参照
    println(func("fuga", ::argFunc))
}

fun argFunc(s: String) : Int {
    return s.length
}