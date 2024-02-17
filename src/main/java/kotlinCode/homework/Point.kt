package kotlinCode.homework

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }
}

fun main() {
    val point1 = Point(3, 5)
    val point2 = Point(2, 4)

    val sum = point1 + point2

    println("Сумма точек: (${sum.x}, ${sum.y})")
}