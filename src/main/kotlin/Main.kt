package org.example

fun main() {
    val num2 = sayHello("Boima", 3)
    val num3 = sayHello("is", 7)
    println(num2 + num3)

    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)
    treatFunction()
    trickFunction()

    val box1 = mutableListOf("Apple", "Banana", "Melon")
    val box2 = box1.asSequence().filter { it[0] == 'B'}
    println(box2)
    println(box2.toList())

    val box3 = mutableListOf(1, 2, 3, 4, 5)
    val box4 = box3.asSequence().filter { it % 2 == 0}
    println(box4)
    println(box4.toList())
}



fun sayHello(str1: String, num1: Int): Int {
    println(str1)

    return (num1 + 1)
}


fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        return treat
    }
}


val trick = {
    println("No treats!")
}


val treat = {
    println("Have a treat!")
}