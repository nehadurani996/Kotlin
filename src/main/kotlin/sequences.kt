package org.example

fun main(){
    //val langugeSequence= sequenceOf ("kotlin", "C++", "Java" )
    //val fromIterable = listOf("kotlin", "C++", "Java" ).asSequence()
    //langugeSequence.filter{it.length > 4 }.map {it.length}.take(2)
    val testScore= mapOf(
        "123abv" to 88.1,
        "124xyz" to 88.9,
        "345abc" to 82.1,
        "345bbc" to 72.1,
        "34efbc" to 66.1,
        "345abc" to 89.1,
        "385agc" to 62.1,
        "837abc" to 85.7,
        "9459bc" to 94.3,
        "nd2192" to 83.8,
    )
    val testscore = testScore.toList()
    testscore.sortedBy { it.second }.take(3).forEach(::println)


}