package org.example
fun main(){
    val sequence = sequenceOf (1,2,2,3,4,5,6 )
    println(sequence.toList())
    println(sequence.toSet())
    val res = sequence.take(3)
    println(res)

    val deliveredProductNames = shop.customers.asSequence()
        .flatMap { customer -> customer.orders.asSequence() }
        .filter { order -> order.isDelivered }
        .flatMap { order -> order.products.asSequence() }
        .map { product -> product.name }
        .toList()

    println(deliveredProductNames)
}