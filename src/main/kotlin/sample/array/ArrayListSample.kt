package sample.array

fun main(args: Array<String>) {
    // List の生成
    // Java標準の List のインスタンスを生成する
    val list = arrayListOf("hoge", "fuga", "piyo")

    for (item in list) {
        println(item)
    }

    // 要素の追加が可能
    list.add("hoge hoge")
    for (item in list) {
        println(item)
    }
}