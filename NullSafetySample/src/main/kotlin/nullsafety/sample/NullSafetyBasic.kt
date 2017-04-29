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
        // if によるNullチェックを行っているため、参照できる
        println("Var s is " + s)
    } else {
        println("Var s is null...")
    }
}