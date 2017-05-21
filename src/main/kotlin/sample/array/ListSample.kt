package sample.array

fun main(args: Array<String>) {
    // イミュータブルリストの生成
    val list = listOf("hoge", "fuga", "piyo")

    // 要素の追加は不可
    // list.add("hoge hoge")

    for (item in list) println(item)

    // ミュータブルリストの生成
    val mutableList = mutableListOf("hoge", "fuga", "piyo")

    // 要素の追加が可能
    mutableList.add("hoge hoge")

    for (item in mutableList) println(item)
}