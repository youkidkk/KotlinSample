package sample.classes

import java.lang.IllegalArgumentException

/**
 * イニシャライザサンプル。
 * インスタンス生成時の初期処理
 */

class InitializerSample(number: Int) {

    // initで定義する
    init {
        require(number > 0) // number が0以下の場合に、IllegalArgumentException がスローされる
        println("Initialized!!! number : $number")
    }

}

fun main(args: Array<String>) {
    try {
        InitializerSample(1)
        InitializerSample(0)
    } catch (e: IllegalArgumentException) {
        println("Failed...")
    }
}