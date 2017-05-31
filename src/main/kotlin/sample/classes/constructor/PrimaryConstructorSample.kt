package sample.classes.constructor

/**
 * プライマリーコンストラクタサンプル。
 */
class PrimaryConstructorSample(
        // varまたはvalを指定した場合、プロパティとなる
        var prop1: String, // varを指定した場合、get、setが可能
        val prop2: String, // valを指定した場合、getのみ可能
        // varまたはvalを指定しない場合、プロパティとならず、initブロック、変数の初期化で利用できる
        arg1: String,
        arg2: String
) {
    val field1 = arg1
    init { println(arg2) }
}

fun main(args: Array<String>) {
    val sample = PrimaryConstructorSample("1", "2", "3", "4")
    sample.prop1 = "5"
    // sample.prop2 = "6" val指定のため、setは不可（コンパイルエラー）
}