package array.sample

fun main(args: Array<String>) {
    // 配列の生成
    val ary = arrayOf("hoge", "fuga", "piyo")
    for (s in ary) {
        println(s)
    }

    // 要素の再代入
    ary[0] = "hogehoge"
    println(ary[0])
}