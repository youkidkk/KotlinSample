package sample.basic.controlflow

/**
 * ラベルサンプル。
 */
fun main(args: Array<String>) {
    // <ラベル名>@ でラベルを指定
    loop@ for(i in 1..10) {
        println()
        print("$i : ")
        for(j in 1..10) {
            print(j)
            // break@<ラベル名>で対象のラベルに対するbreakとなる
            // continue でも同様
            if(i == 5 && j > 7) break@loop
            if(j == 9) continue@loop
        }
    }
}