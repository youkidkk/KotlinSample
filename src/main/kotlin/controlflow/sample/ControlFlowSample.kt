package controlflow.sample

fun main(args: Array<String>) {
    for (i in 1..20) {
        println("$i is " + if(i % 2 == 0) {
            "even."
        } else {
            "odd."
        })
    }

    for (i in 1..20) {
        println("$i is " + when {
            i == 1 -> {
                "1."
            }
            i % 2 == 0 -> {
                "even."
            }
            i % 3 == 0 -> {
                "multiples of 3."
            }
            else -> {
                "not even."
            }
        })
    }
}