package org.example

// Refactor getOutput() to use a when expression
fun getOutput(input: Any?): String = when (input) {
    is Number -> {
        if (input !is Int){
            "Input was an Int"
        } else
            "Input is not Int"
    }
    is String -> "Input was a String with length ${input.length}"
    null -> "Input was null"
    else -> "Input does not match any input condition"
    }
fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
    println(getOutput('a'))
}
