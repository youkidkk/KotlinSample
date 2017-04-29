package nullsafety.sample

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
        // s が null ではない場合
        println("Var s is " + s)
    } else {
        // s が null の場合
        println("Var s is null...")
    }
}