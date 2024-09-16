package org.example
fun main(){
    val number=listOf(1,2,3,4,5)
    val remaider= number.maxByOrNull { it%2 }
    val remaider1= number.minByOrNull { it%2 }
    println(remaider)
    println(remaider1)
    val values= listOf("Neha", "Alisha", "Aima", "Abroh", "Mehak")
    val result= values.maxWithOrNull(compareBy {it.length} )
    println(result)
}