package sample.nullsafety

fun main(args: Array<String>) {
    // Nullable ではないため、以下はコンパイルエラーとなる
    // var string: String = null

    // Nullable であるため、以下はOK
    val string: String? = "String value"
    val nullString: String? = null

    // Nullチェックを行わずに直接参照するとコンパイルエラーとなる
    // println(string.length)

    // エルビス演算子 : デフォルト値を指定する
    println(string ?: "default value") // -> stringの値となる
    println(nullString ?: "default value") // -> "default value"となる

    // !!演算子 : NullableをNotNullに強制的に変換する
    val value1 = string!!
    println(value1) // -> "String value"
    // 右辺がnullのため、以下は kotlin.KotlinNullPointerException がスローされる
    // val value2 = nullString!!

    // requireNotNull関数 : !!演算子と同様の動作
    // 第一引数に対象の変数、第二引数にnullの場合の例外メッセージを指定する
    val value3 = requireNotNull(string, { "Null value" })
    println(value3) // -> "String value"
    // 第一引数がnullのため、以下は java.lang.IllegalArgumentException がスローされる
    // val value4 = requireNotNull(nullString, { "Null value" })
}
