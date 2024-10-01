package org.example

import java.io.File
import kotlin.io.path.writeLines

fun main(args: Array<String>) {
    scores()
    userInput()
    validFile()
    if (args.isEmpty()) {
        println("Please add some arguments ")
        return
    }
    println("First arg is ${args[0]}")
    for (arg in args) {
        println(arg)
    }
}
fun userInput(){
    print("Enter username: ")
    val userName = readLine()
    print("You entered: $userName ")
}
fun validFile(){
    print("Enter file name: ")
    val fileName = readLine() ?: ""
    val validFile= File(fileName).isFile
    if (validFile) {
        println("File exists.")

    }else{
        println("File does not exist.")
    }

}
fun scores(){
    val scoreFile= File("scores.txt")
    scoreFile.forEachLine {
        line -> println(line)
    }
    val sortedLines= scoreFile.readLines().sorted()
    val outputFile= File("sorted_output.txt").toPath()
    outputFile.writeLines(sortedLines)
}
