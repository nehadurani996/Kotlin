package org.example


fun main(){
    var myMap= mapOf<Int, String>(2 to "Neha", 7 to "Neha 2", 5 to "Alisha")
    var myHashMap= HashMap<Int, String>()
    var myHashMutable= mutableMapOf<String, String>() // linked hashmap
    myHashMutable.put("NY", "")
    myHashMutable.put("NJ", "New Jersey")
    myHashMutable.put("LA", "Los Angeles")
    var new = myHashMutable.putIfAbsent("NY", "Not allowed")
    println(new)
    for (elem in myHashMutable){
        println(elem)
    }


    myHashMap.put(1,"Jack")
    myHashMap.put(2,"Jackie")
    for (entry in myHashMap){
        println(entry)
    }
    for (element in myMap){
        println(element)
    }
    for (keys in myMap.keys){
        println(myMap[keys])
    }

}