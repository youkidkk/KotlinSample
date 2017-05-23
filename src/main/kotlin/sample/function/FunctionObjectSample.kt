package sample.function

/**
 * 関数オブジェクトサンプル。
 */
fun main(args: Array<String>) {
    val funcList = mutableListOf<(String) -> Int>()

    // fun で定義
    val func1 = fun(s: String) : Int {
        return s.length // return で返却
    }
    funcList.add(func1)

    // インライン関数１
    // 型の指定は必須
    val func2 : (String) -> Int = { s ->
        // return は使用しない（外側のメソッドのリターンになってしまう）
        s.length
    }
    funcList.add(func2)

    // インライン関数２
    // 引数を省略して it を使用する場合（引数が１つのみの場合に使用可）
    val func3 : (String) -> Int = {
        it.length
    }
    funcList.add(func3)

    funcList.forEach {
        println(it.invoke("hoge hoge hoge"))
    }
}