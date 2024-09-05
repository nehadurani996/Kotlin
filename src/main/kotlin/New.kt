package org.example

var greetingFunction:() -> Unit ={
    println("Hello World!")
}
fun printCalculatedValue(value1: Int, value2: Int, calculator:(Int, Int)-> Int ){
    println("The value is: ${calculator(value1, value2)}")

}
fun main(){
    printCalculatedValue(2,3,{x,y ->
        x+y
    })
    greetingFunction()
    greetingFunction=
        {
            println("Hello Kotlin")
        }
    greetingFunction()
}