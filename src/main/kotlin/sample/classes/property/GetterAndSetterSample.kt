package sample.classes.property

/**
 * Getter、Setterサンプル。
 */
class GetterAndSetterSample {
    var prop: String = ""
        // Getter
        get() = field //「field」がプロパティ値となる
        // Setter
        set(value) {
            println("value : $value")
            // 値を設定する場合は「field」に設定する
            field = value
        }
}

fun main(args: Array<String>) {
    val sample = GetterAndSetterSample()
    sample.prop = "hoge hoge"
    println(sample.prop)
}