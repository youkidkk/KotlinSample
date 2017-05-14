package sample.classes.property

/**
 * val、varプロパティサンプル。
 */
class ValAndVarPropertySample {
    // val で宣言 -> 参照のみ可能
    val valProp: String = "value prop"

    // var で宣言 -> 参照、設定とも可能
    var varProp: String = "variable prop"
}

fun main(args: Array<String>) {
    val sample = ValAndVarPropertySample()

    // いずれも参照は可能
    println("valProp : ${sample.valProp}, varProp : ${sample.varProp}")

    // var のみ設定可能
    sample.varProp = "set value"
    // val は設定不可のため、以下はコンパイルエラー
    // sample.valProp = "set value"
}