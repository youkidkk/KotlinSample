package sample.basic.controlflow

fun main(args: Array<String>) {
    val i : Int = 100

    // Java標準と同様の記法
    if (i > 0) {
        println(i)
    }

    // Java標準と異なり、戻り値を返却可能
    // ブロック内の最後の式の結果が戻り値となる
    val i2 : Int = if (i > 50) {
        i - 50
    } else {
        // 戻り値として使用する場合は else句が必須となる
        i
    }
    println(i2)
}