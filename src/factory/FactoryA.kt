package factory

class FactoryA :Factory {
    override fun gerProduct(): Product {
        return DirtA()
    }
}