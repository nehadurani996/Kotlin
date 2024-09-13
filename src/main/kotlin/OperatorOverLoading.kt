package org.example

fun main() {
    var p1= Point(7,9)
    var p2= Point(2,3)
    println("Plus With operator overloading ${p1 + p2}") // with operator overloading
    println("Minus With operator overloading ${p1 - p2}")
    println("Increment overloading ${++p1}")
    if (p1.x>p2.x){println("$p1 is greater than $p2 based on x")} else { println("$p1 is not greater than $p2 based on x")}
    if (p1.x>=p2.x){println("$p1 is greater than or equal to $p2 based on x")} else { println("$p1 is not greater than or equal to $p2 based on x")}
    println("Without operator overloading ${p1.add(p2)}") // without overloading
    val startDate = Date(2023, 9, 1)
        val endDate = Date(2023, 9, 5)
        val dateRange = startDate..endDate

        for (date in dateRange) {
            println(date)
}       }
data class Point(val x:Int, val y:Int): Comparable<Point>{
    operator fun plus(point: Point): Point {                // with operator
        return Point(this.x + point.x, this.y + point.y)
    }
    fun add(point: Point): Point{
      return Point(this.x + point.x, this.y + point.y)
    }
    operator fun minus(point: Point): Point {
        return Point(this.x - point.x, this.y - point.y)
    }
    operator fun inc(): Point {
        return Point(this.x + 1, this.y + 1)
    }

    override fun compareTo(other: Point): Int {      //override is used because the method is already defined in comparebale interface.
        return x.compareTo(other.x)
    }
    override fun toString(): String {
        return "($x, $y)"
    }
}
data class Date(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<Date>{
    override fun compareTo(other: Date): Int {
        return when {
            this.year!= other.year -> this.year- other.year
            this.month != other.month -> this.month - other.month
            else -> this.dayOfMonth - other.dayOfMonth
        }
    }

    operator fun rangeTo(other: Date): DateRange{
        return DateRange(this, other)
    }
}
class DateRange(override val start: Date, override val endInclusive: Date) : ClosedRange<Date>, Iterable<Date> {
    override fun iterator(): Iterator<Date> = object : Iterator<Date> {
        var current = start

        override fun hasNext(): Boolean = current <= endInclusive

        override fun next(): Date {
            val result = current
            current = current.nextDay()
            return result
        }
    }
}
fun Date.nextDay(): Date {
    // Simplified logic for getting the next day
    return when {
        this.dayOfMonth < 30 -> this.copy(dayOfMonth = this.dayOfMonth + 1)
        this.month < 12 -> this.copy(month = this.month + 1, dayOfMonth = 1)
        else -> this.copy(year = this.year + 1, month = 1, dayOfMonth = 1)
    }

}