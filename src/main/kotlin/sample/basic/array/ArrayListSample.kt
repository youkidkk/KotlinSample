package sample.basic.array

fun main(args: Array<String>) {
    // List の生成
    // Java標準の ArrayList のインスタンスを生成する
    val list = arrayListOf("hoge", "fuga", "piyo")
    println(list.javaClass) // -> class java.util.ArrayList

    for (item in list) {
        println(item)
    }

    // 要素の追加が可能
    list.add("hoge hoge")
    for (item in list) {
        println(item)
    }
}