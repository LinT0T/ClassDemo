package absotractFactory

import absotractFactory.nongJia.NongJiaFactory
import absotractFactory.hunNingTu.HunNingTuFactory

fun main() {
    /** 抽象工厂模式 */
    val dirtFactory: DirtFactory = HunNingTuFactory()
    val hntToy: Toy = dirtFactory.createToy()
    hntToy.description()
    val food: Food = dirtFactory.createFood()
    food.description()

    val dellFactory: DirtFactory = NongJiaFactory()
    val dellKeyboard: Toy = dellFactory.createToy()
    dellKeyboard.description()
    val dellMouse: Food = dellFactory.createFood()
    dellMouse.description()
}