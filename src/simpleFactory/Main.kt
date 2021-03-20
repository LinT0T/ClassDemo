package simpleFactory

import factory.Product

fun main() {
    val dirtA: Product = Factory().getProduct("A")
    println("name: ${dirtA.getName()}; price: ${dirtA.getPrice()}")
    val dirtB: Product = Factory().getProduct("B")
    println("name: ${dirtB.getName()}; price: ${dirtB.getPrice()}")
    val DirtC: Product = Factory().getProduct("C")
    println("name: ${DirtC.getName()}; price: ${DirtC.getPrice()}")
    val DirtD: factory.Product = simpleFactory.Factory().getProduct("D")
    println("name: ${DirtD.getName()}; price: ${DirtD.getPrice()}")
}