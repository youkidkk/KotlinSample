package sample.nullsafety

fun main(args: Array<String>) {
    // Nullable ではないため、以下はコンパイルエラーとなる
    // var s : String = null


    // Nullable であるため、以下はOK
    var s : String? = null

    // Nullチェックを行わずに直接参照するとコンパイルエラーとなる
    // println(s.length)

    print(s)

    s = "not Null!!!"
    print(s)
}

fun print(s : String?) {
    if (s != null) {
        // if によるNullチェックを行っており、
        // スマートキャストされ、直接参照できるようになる
        println("Var s is " + s)
    } else {
        println("Var s is null...")
    }

    // 以下の記法でも同じ
    // Nullだった場合のデフォルト値を設定する
    println("Var s is " + (s ?: "null..."))
}