package factory

class DirtD:factory.Product {
    override fun getPrice(): Int {
       return 20
    }

    override fun getName(): String {
      return "高端水泥"
    }
}