package simpleFactory

import factory.Product

class DirtA: Product {
    override fun getPrice(): Int {
        return 2
    }

    override fun getName(): String {
        return "低价工地土"
    }
}