package sample.function.lambda

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

    // ラムダ式１
    // 型の指定は必須
    val func2 : (String) -> Int = { s ->
        // return は使用しない（外側のメソッドのリターンになってしまう）
        s.length
    }
    funcList.add(func2)

    // ラムダ式２
    // 引数を省略して it を使用する場合（引数が１つのみの場合に使用可）
    val func3 : (String) -> Int = {
        it.length
    }
    funcList.add(func3)

    funcList.forEach {
        // 呼び出しは it に直接引数を渡すか、
        // it.invoke(...) とする
        println(it("hoge hoge hoge"))
    }
}