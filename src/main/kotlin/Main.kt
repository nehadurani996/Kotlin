package org.example
fun greeting(){
    println("Hello World!")
}

fun getGreeting(): String {
    return "Hello Kotlin!"
}
fun FunGreeting()= "Fun Greeting!"
fun main() {
    fun FunGreeting()= "Fun Greeting!"
    val ourFirstVariable: Boolean = true
    val ourSecondVariable = 3
    //println(ourFirstVariable)
    //println(ourSecondVariable)
    var aNullAbleString : String? = null
    //println((aNullAbleString?.length))
    greeting()
    println(getGreeting())
    println(FunGreeting())

}
