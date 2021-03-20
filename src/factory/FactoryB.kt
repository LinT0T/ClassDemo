package factory

class FactoryB:Factory {
    override fun gerProduct(): Product {
        return DirtB()
    }
}