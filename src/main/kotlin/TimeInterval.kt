package org.example
fun main(){
    val numbers = listOf(1,2,3,4,5)
    val(match,res)= numbers.partition { it < 3 }
    println((numbers).joinToString())
    println((match).joinToString())
    println((res).joinToString())
    val numbersS= listOf("one", "two","three","four","five","six")
    println(numbersS.any{it.endsWith("e")})
    println(numbersS.any{it.startsWith("f")})
    val numberT = listOf("one", "two", "three", "four")
    val empty = emptyList<String>()

    println(numberT.any())
    println(empty.any())

    println(numberT.none())
    println(empty.none())
}
fun Suplimantory(){
    val readOnlyListOf= listOf(1,2,3,4,5)
    val readOnlySetOf= setOf(1,2,3,4,5)
    val readOnlyMap= mapOf(1 to "one", 2 to "two", 3 to "three")

    val ListOf= mutableListOf(1,2,3,4,5)
    val SetOf= mutableListOf(1,2,3,4,5)
    val Map= mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println(Map.size)
    SetOf.isEmpty()
    SetOf.isNotEmpty()

    for (elements in ListOf){
        println(elements)
    }
    Map.forEach {key ,values -> println(values)}


    val languages= mapOf(
        "Kotlin" to 4,
        "Java" to 8,
        "Python" to 10,
        "JavaScript" to 11
    )
    languages.filter{it.value >= 5 }.map{it.key}.sorted().forEach{println(it)}

}

