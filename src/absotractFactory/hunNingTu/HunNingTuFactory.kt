package absotractFactory.hunNingTu

import absotractFactory.DirtFactory
import absotractFactory.Toy
import absotractFactory.Food

class HunNingTuFactory : DirtFactory {
    override fun createToy(): Toy {
        return HunNingTuToy()
    }

    override fun createFood(): Food {
        return HunNingTuFood()
    }
}