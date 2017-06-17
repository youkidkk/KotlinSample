package sample.function.scope

/**
 * let関数サンプル。
 * Nullableな変数に対して、Javaの Optionalの
 * ・ifPresent
 * ・map
 * ・flatMap
 * と同様の処理を行うことができる。
 *
 */
fun main(args: Array<String>) {
    val nullVal: String? = null
    val notNullVal: String? = "Not null"

    println(letFunc(nullVal)) // -> null
    println(letFunc(notNullVal)) // -> NOT NULL
}

fun letFunc(arg: String?): String? {
    // arg が null ではない場合のみ、ラムダ式が実行される
    return arg?.let { it.toUpperCase() }
}