package org.example

import jdk.javadoc.internal.doclets.formats.html.taglets.snippet.Action

fun main(){
    val program= Program()
    program.addTwoNumbers(5,7)
    program.addTwoNumbers(5,7, object : MyInterface{
        override fun execute(sum: Int) {
            println("sum = $sum")
        }
    })
    val myLambda : (Int) -> Unit= { s: Int -> println("Sum from lambda is $s")} // lambda
    program.addTwoNumbers(5,7, myLambda)
}
class Program(){
    fun addTwoNumbers( a : Int,  b : Int, action: (Int)->Unit) {
        val sum = a + b
        action(sum)
    }
    fun addTwoNumbers( a : Int,  b : Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers( a : Int,  b : Int){
        val sum = a+b
        println("Sum of the two numbers is $sum") // added comment
    }

}

interface MyInterface  {
    fun execute(sum:Int)
}