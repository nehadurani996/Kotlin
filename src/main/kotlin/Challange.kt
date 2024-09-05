package org.example

fun formatter(firstName: String, secondName: String, formettor:(String,String)->String) {
    println(formettor(firstName,secondName))
}
fun main(){
    formatter("Neha", "Durani",{x,y->
        "Firstname is $x and Second name is $y"
        })
}