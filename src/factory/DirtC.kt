package factory

import factory.Product

class DirtC: Product {
    override fun getPrice(): Int {
      return 12
    }

    override fun getName(): String {
        return "进口混凝土"
    }
}