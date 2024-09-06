package org.example

// Refactor getOutput() to use a when expression
fun getOutput(input: Any?): String = when (input) {
    is Int -> "Input was an Int"
    is String -> "Input was a String with length ${input.length}"
    //is null -> "Input was null"
    else -> "Input was a non-Int Number"
    }
fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
    println(getOutput('a'))
}
