package org.example
fun <T> printList(list: List<T>) {
    for (items in list)
        println(items)
}
fun <T,X>pairPrint(firest: T, Second:X){
    println(firest)
    println(Second)
}
fun <X> printDetails( elements:List<X>) {
    println(elements.size)
    for (element in elements) {
        println(element)
    }
fun <T : Number> numberLIsT(numbers: List<T>) {
        val sum = numbers.fold(0.0) { sum, element -> sum + element.toDouble() }
        println(sum)
}

class Box<T>(val value: T)

fun main() {
    val intList = listOf(1, 2, 3, 4, 5)
        val stringList = listOf("One", "Two", "Three")
        printList(intList)
        printList(stringList)
        val intBox = Box(123)
        val StringBox = Box("Hello")
        println(intBox.value)
        print(StringBox.value)
        val ExactNumber = 7
        val Stringval = "Cayoti"
        pairPrint(ExactNumber, Stringval)
        val elem = listOf(1, 2, 3, 4, "seven", "#", "uio")
        printDetails(elem)
        numberLIsT(intList)
}

}