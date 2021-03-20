package factory

fun main() {
    val factoryA = FactoryA()
    println(factoryA.gerProduct().getName())
    val factoryB = FactoryB()
    println(factoryB.gerProduct().getName())
    val factoryC = FactoryC()
    println(factoryC.gerProduct().getName())
    val factoryD = FactoryD()
    println(factoryD.gerProduct().getName())
}