package org.example
data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
    override fun toString() = name
}


val city1= City("New York")
val city2 = City("Berlin")
val city3 = City("London")
val product1 = Product("Ballon",10.0)
val product2 = Product("Palm",19.78)
val product3 = Product("Salad",89.00)
val order1= Order(listOf(product1), false)
val order2 = Order(listOf(product1,product3), true)
val customer1 = Customer("John Smith", city1,listOf(order1))
val customer2 = Customer("John Keith", city2,listOf(order2))
val customer3= Customer("Alice",city3,listOf())
val customer4= Customer("Alice",city3,listOf(order2))
val shop= Shop("DNB Shop", listOf(customer1,customer2,customer3))

fun main() {
    val allDeliveredProducts = shop.customers.flatMap { customer ->
        customer.orders.filter { it.isDelivered }.flatMap { order ->
            order.products.map { it.name }
        }
    }
    println(allDeliveredProducts)
    val getAllOrderedProducts = shop.customers.flatMap { customer ->
        customer.orders.flatMap { order -> order.products.map { it.name } }
    }
    println(getAllOrderedProducts)
    val allCities = shop.customers.map { it.city }
    println(allCities)
    val getAllOrderedProductsPrice = shop.customers.flatMap { customer ->
        customer.orders.flatMap { order -> order.products.map { it.price } }
    }.sum()
    println(getAllOrderedProductsPrice)
    val uniqueProducts = shop.customers.map { customer ->
        customer.orders.flatMap { order ->
            order.products.map { product -> product.name }.distinct()
        }
    }
    println(uniqueProducts)
    val notEmptyCustomer= shop.customers.filter { customer -> customer.orders.isNotEmpty() }
    println(notEmptyCustomer)

    val customersInBerlin = shop.customers.filter { it.city == city1 }.flatMap { customer -> customer.orders.flatMap{
        it.products
    }}
    println(customersInBerlin)
    val getDeliveredOrderByCustomer= shop.customers.flatMap {
        customer -> customer.orders.filter { order -> order.isDelivered }
    }
    println(getDeliveredOrderByCustomer)
}

