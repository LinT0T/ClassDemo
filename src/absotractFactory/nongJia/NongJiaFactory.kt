package absotractFactory.nongJia

import absotractFactory.DirtFactory
import absotractFactory.Toy
import absotractFactory.Food

class NongJiaFactory : DirtFactory {
    override fun createToy(): Toy {
        return NongJiaToy()
    }

    override fun createFood(): Food {
        return NongJiaFood()
    }
}