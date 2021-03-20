fun main(args: Array<String>) {
    /** 策略模式 */
    val strategyContextKt = KtStrategyContext(KtOperationAdd())
    println("7 + 8 = ${strategyContextKt.executeStrategy(7, 8)}")
    strategyContextKt.strategy = KtOperationSubtract()
    println("7 - 8 = ${strategyContextKt.executeStrategy(7, 8)}")
    strategyContextKt.strategy = KtOperationMultiply()
    println("7 * 8 = ${strategyContextKt.executeStrategy(7, 8)}")
}