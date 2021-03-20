package simpleFactory

import factory.DirtA
import factory.DirtB
import factory.DirtC
import factory.Product

class Factory {
    fun getProduct(type: String): Product =
        when (type) {
            "A" -> DirtA()
            "B" -> DirtB()
            "C" -> DirtC()
            "D" -> DirtD()
            else -> DirtA()
        }
}