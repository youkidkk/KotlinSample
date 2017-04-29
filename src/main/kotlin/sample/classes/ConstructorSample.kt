package sample.classes

class ConstructorSample(
            private val number : Int, // val または var を指定すると、プロパティとなる
            var text : String, // private を指定しない場合は外部からアクセス可能となる
            arg : String // 指定しなかった場合はプロパティとならず、フィールドの初期化に使用できる
    ) {

    // セカンダリーコンストラクタ
    // this を使用してプライマリーコンストラクタを呼び出す
    constructor(number : Int, text : String) : this(number, text, "")

    // コンストラクタの引数を使用して初期化が可能
    private val length = arg.length

    fun print() {
        println("ConstructorSample : ")
        println("  Number : ${number}")
        println("  Text : ${text}")
        println("  Length : ${length}")
    }

}

fun main(args: Array<String>) {
    // プライマリーコンストラクタを使用
    ConstructorSample(1, "hoge", "fuga fuga").print()

    // セカンダリーコンストラクタを使用
    val sample = ConstructorSample(2, "piyo")
    sample.text = "piyo piyo" // プロパティへのアクセス
    sample.print()
}