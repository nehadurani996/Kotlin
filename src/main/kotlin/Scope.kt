package org.example
class Personc{
    var name: String= "Neha Durani"
    var age: Int= 24
}
class Hobbies{
    var hobby1: String= ""
    var hobbyId: Int = 0
}
class Animals{
}
fun main() {
    val person = Personc()
    val hobby = Hobbies().apply {
        hobby1 = "Cycling"
        hobbyId = 23
    }
    val numberList: MutableList<Int> = mutableListOf(1,2,3)
    
    with(person) {
        println(name)
        println(age)
    }

}