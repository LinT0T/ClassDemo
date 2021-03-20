package factory

class FactoryC:Factory {
    override fun gerProduct(): Product {
        return DirtC()
    }
}