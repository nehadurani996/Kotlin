package org.example

import java.io.File
import kotlin.io.path.writeLines
import kotlin.io.readLines

fun main(){
    print("Enter the name of file: ")
    val fileName= readLine() ?: ""

    if (fileName.isNullOrEmpty()) {
        println("Please enter a name for the file")
        return
    }
    val scoreFile= File(fileName)
    if(!scoreFile.isFile()) return
    val rawScore = scoreFile.readLines()
    val parsedScores = rawScore.map {
        line ->
        val elements = line.split(":")
        elements[0] to elements[1]
    }
   val finalScore = parsedScores.sortedByDescending {
       it.second
   }.take(3)
    val output = File("sorted.txt").toPath()
    val outputScore = finalScore.map {
        "${it.first}: ${it.second}"
    }
    output.writeLines(outputScore)
}