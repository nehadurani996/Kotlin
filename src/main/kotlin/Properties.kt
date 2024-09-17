package org.example
import kotlin.properties.Delegates
class Book(val title: String , var author: String )
class Rectangle(val width: Double, val height: Double){
    val area : Double
    get() = width * height

}
class User{
    lateinit var email : String
    fun initalizeEmail(email: String){
        this.email = email
    }
}

class Database(){
    val connection: String by lazy{
        println("Connecting to Database")
        "Connected to Database"
    }
}

class Person(){
    var age: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("The value changed from $oldValue to $newValue")
    }
}

fun main() {
    val book = Book("Harry Potter", "Harry styles")
    println("Book name: {$book.title}\nAuthor: {${book.author}}")

    book.author = "Harry James"
    println("Book name: {$book.title}\nAuthor: {${book.author}}")


    val rect = Rectangle(width = 9.0, height = 1.0)
    println(rect.area)

    val user= User()
    user.initalizeEmail("neha@example.com")
    println("My email is: ${user.email}")

    val db= Database()
    println("Before connection")
    println(db.connection)
    println("After connection")

    val person = Person()
    person.age= 17
    person.age= 18
    person.age= 19

}