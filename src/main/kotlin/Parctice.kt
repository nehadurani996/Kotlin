package org.example
import kotlin.random.Random

fun main(){
    var fruits = arrayOf("Basket", "Mango" ,"Ice-ream")
    for (i in 0 until fruits.size) {
        println(fruits[i])
    }

}
    /*for (i in 0 until 5){
        val randomNum= Random.nextInt()
        val isEven = randomNum.rem(2) == 0
        if(isEven){
            println("$randomNum is even")
        } else
            println("$randomNum is odd")
    }
}
*/
// Loop iterating from 0-4
// generate random number
// check random number is int or not.