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

class Polygon(point1: Point, point2: Point, point3: Point) {

    val points = arrayOfNulls<Point>(3)

    init {
        this.points[0] = point1
        this.points[1] = point2
        this.points[2] = point3
    }

    /** obj[index]のオーバーロード */
    operator fun get(index: Int) = this.points[index]!!

    /** obj[index] = ・・・ のオーバーロード */
    operator fun set(index: Int, point: Point) {
        this.points[index] = point
    }

    override fun toString(): String = "${points[0]}, ${points[1]}, ${points[2]}"

}

fun main(args: Array<String>) {
    val point1 = Point(5, 3)
    val point2 = Point(2, 1)

    println("Point1 + Point2 : ${point1 + point2}")
    println("Point1 - Point2 : ${point1 - point2}")
    println("Point1 * 3 : ${point1 * 3}")

    val polygon = Polygon(Point(1, 2), Point(3, 4), Point(5, 6))
    println("Polygon[0] : ${polygon[0]}")
    polygon[1] = point1
    polygon[2] = point2
    println("Polygon : $polygon")
}