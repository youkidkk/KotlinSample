package controlflow.sample

fun main(args: Array<String>) {
    val s : String = "hoge"

    // Java標準の switch と同様の記法
    when(s) {
        "hoge" -> println("s is hoge.")
        "fuga" -> println("s is fuga.")
        else -> println("other.")
    }

    val s2 : String = when(s) {
        "hoge" -> "hoge hoge"
        "fuga" -> "fuga fuga"
        // if と同様に else句が必須となる
        else -> "other"
    }
    println(s2)
}