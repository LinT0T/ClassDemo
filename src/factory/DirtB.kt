package factory

import factory.Product

class DirtB: Product {
    override fun getPrice(): Int {
        return 10
    }

    override fun getName(): String {
      return "精品农家土"
    }
}