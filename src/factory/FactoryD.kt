package factory

class FactoryD :Factory {
    override fun gerProduct(): Product {
        return DirtD()
    }
}