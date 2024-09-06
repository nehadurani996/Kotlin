package org.example

fun formatter(firstName: String, secondName: String, formattors:(String,String)->String) {
    println(formattors(firstName,secondName))
}
fun main(){
    formatter("Neha", "Durani",{x,y->
        "Firstname is $x and Second name is $y"
        })
}