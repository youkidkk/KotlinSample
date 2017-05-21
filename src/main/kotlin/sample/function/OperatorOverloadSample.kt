package sample.function

/**
 * 演算子オーバーロードサンプル。
 */

data class Point(val x: Int, val y: Int) {

    /** +演算子のオーバーロード */
    operator fun plus(point: Point) : Point {
        return Point(this.x + point.x, this.y + point.y)
    }

    /** -演算子のオーバーロード */
    operator fun minus(point: Point) : Point {
        return Point(this.x - point.x, this.y - point.y)
    }

    /** *演算子のオーバーロード */
    operator fun times(times: Int) : Point {
        return Point(this.x * times, this.y * times)
    }

}

fun main(args: Array<String>) {
    val point1 = Point(5, 3)
    val point2 = Point(2, 1)

    println("Point1 : $point1")
    println("Point2 : $point2")

    println("Point1 + Point2 : ${point1 + point2}")
    println("Point1 - Point2 : ${point1 - point2}")
    println("Point1 * 3 : ${point1 * 3}")
}